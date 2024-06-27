package org.example.visitor;

import org.example.memento.TaxiWithMemento;

/**
 * Интерфейс посетителя для сохранения состояния автомобиля.
 */
public interface Visitor {
    void visit(TaxiWithMemento taxi);
}
