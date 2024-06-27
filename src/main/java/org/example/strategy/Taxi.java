package org.example.strategy;

/**
 * Класс Taxi с поддержкой смены тарифа.
 */
public class Taxi {
    private TariffStrategy tariffStrategy;

    public Taxi(TariffStrategy tariffStrategy) {
        this.tariffStrategy = tariffStrategy;
    }

    public void setTariffStrategy(TariffStrategy tariffStrategy) {
        this.tariffStrategy = tariffStrategy;
    }

    public double calculateFare(double distance) {
        return tariffStrategy.calculateFare(distance);
    }
}
