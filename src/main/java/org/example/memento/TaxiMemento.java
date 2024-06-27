package org.example.memento;

/**
 * Класс-хранитель для состояния автомобиля.
 */
public class TaxiMemento {
    private TaxiState state;

    public TaxiMemento(TaxiState state) {
        this.state = state;
    }

    public TaxiState getState() {
        return state;
    }
}
