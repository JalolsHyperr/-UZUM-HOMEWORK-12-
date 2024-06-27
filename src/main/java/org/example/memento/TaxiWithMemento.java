package org.example.memento;

import org.example.visitor.Visitor;

/**
 * Класс Taxi с поддержкой паттерна Memento.
 */
public class TaxiWithMemento {
    private String driver;
    private double mileage;
    private String status;

    public void set(String driver, double mileage, String status) {
        this.driver = driver;
        this.mileage = mileage;
        this.status = status;
    }

    public TaxiMemento saveToMemento() {
        return new TaxiMemento(new TaxiState(driver, mileage, status));
    }

    public void restoreFromMemento(TaxiMemento memento) {
        TaxiState state = memento.getState();
        this.driver = state.getDriver();
        this.mileage = state.getMileage();
        this.status = state.getStatus();
    }

    public String getDriver() {
        return driver;
    }

    public double getMileage() {
        return mileage;
    }

    public String getStatus() {
        return status;
    }

    // Метод accept для паттерна Visitor
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
