package org.example.main;

import org.example.strategy.*;
import org.example.state.*;
import org.example.memento.*;
import org.example.visitor.*;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * Главный класс для демонстрации работы паттернов.
 */
public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            // Демонстрация паттерна Strategy
            Taxi taxi = new Taxi(new StandardTariff());
            LOGGER.log(Level.INFO, "Стоимость поездки: {0}", taxi.calculateFare(10));

            taxi.setTariffStrategy(new EconomyTariff());
            LOGGER.log(Level.INFO, "Стоимость поездки: {0}", taxi.calculateFare(10));

            // Демонстрация паттерна State
            TaxiContext context = new TaxiContext();

            StoppedState stoppedState = new StoppedState();
            stoppedState.handle(context);

            DrivingState drivingState = new DrivingState();
            drivingState.handle(context);

            SpeedingState speedingState = new SpeedingState();
            speedingState.handle(context);

            // Демонстрация паттерна Memento
            TaxiWithMemento taxiWithMemento = new TaxiWithMemento();
            taxiWithMemento.set("Driver1", 1200.0, "Стоит");

            TaxiMemento memento = taxiWithMemento.saveToMemento();

            taxiWithMemento.set("Driver2", 1300.0, "Едет");
            LOGGER.log(Level.INFO, "Текущее состояние: водитель - {0}, пробег - {1}, статус - {2}",
                    new Object[]{taxiWithMemento.getDriver(), taxiWithMemento.getMileage(), taxiWithMemento.getStatus()});

            taxiWithMemento.restoreFromMemento(memento);
            LOGGER.log(Level.INFO, "Восстановленное состояние: водитель - {0}, пробег - {1}, статус - {2}",
                    new Object[]{taxiWithMemento.getDriver(), taxiWithMemento.getMileage(), taxiWithMemento.getStatus()});

            // Демонстрация паттерна Visitor
            XmlVisitor xmlVisitor = new XmlVisitor();
            taxiWithMemento.accept(xmlVisitor);

            JsonVisitor jsonVisitor = new JsonVisitor();
            taxiWithMemento.accept(jsonVisitor);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Произошла ошибка: {0}", e.getMessage());
        }
    }
}
