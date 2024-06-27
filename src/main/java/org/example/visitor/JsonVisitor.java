package org.example.visitor;

import org.example.memento.TaxiWithMemento;

/**
 * Посетитель для сохранения состояния автомобиля в JSON.
 */
public class JsonVisitor implements Visitor {
    @Override
    public void visit(TaxiWithMemento taxi) {
        // Логика для сохранения в JSON
        System.out.println("Сохраняем состояние такси в формате JSON");
    }
}
