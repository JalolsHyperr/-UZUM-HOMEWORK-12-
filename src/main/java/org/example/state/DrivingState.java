package org.example.state;

/**
 * Состояние "Едет" для автомобиля.
 */
public class DrivingState implements State {
    @Override
    public void handle(TaxiContext context) {
        System.out.println("Такси едет.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Driving";
    }
}
