package org.example.state;

/**
 * Контекст для управления состояниями автомобиля.
 */
public class TaxiContext {
    private State state;

    public TaxiContext() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
