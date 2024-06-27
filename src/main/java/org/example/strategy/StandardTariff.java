package org.example.strategy;

/**
 * Реализация стандартного тарифа.
 */
public class StandardTariff implements TariffStrategy {
    @Override
    public double calculateFare(double distance) {
        return distance * 1.5;
    }
}
