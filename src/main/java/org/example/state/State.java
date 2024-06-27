package org.example.state;

/**
 * Интерфейс для состояния автомобиля.
 */
public interface State {
    void handle(TaxiContext context);
}
