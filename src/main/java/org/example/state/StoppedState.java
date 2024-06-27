package org.example.state;

/**
 * Состояние "Стоит" для автомобиля.
 */
public class StoppedState implements State {
    @Override
    public void handle(TaxiContext context) {
        System.out.println("Такси стоит.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stopped";
    }
}
