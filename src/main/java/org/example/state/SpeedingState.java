package org.example.state;

/**
 * Состояние "Мчится" для автомобиля.
 */
public class SpeedingState implements State {
    @Override
    public void handle(TaxiContext context) {
        System.out.println("Такси мчится.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Speeding";
    }
}
