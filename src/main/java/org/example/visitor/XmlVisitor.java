package org.example.visitor;

import org.example.memento.TaxiWithMemento;

/**
 * Посетитель для сохранения состояния автомобиля в XML.
 */
public class XmlVisitor implements Visitor {
    @Override
    public void visit(TaxiWithMemento taxi) {
        // Логика для сохранения в XML
        System.out.println("Сохраняем состояние такси в формате XML");
    }
}
