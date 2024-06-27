package org.example.memento;

/**
 * Класс состояния автомобиля.
 */
public class TaxiState {
    private String driver;
    private double mileage;
    private String status;

    public TaxiState(String driver, double mileage, String status) {
        this.driver = driver;
        this.mileage = mileage;
        this.status = status;
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
}
