package org.example.strategy;

/**
 * Реализация экономного тарифа.
 */
public class EconomyTariff implements TariffStrategy {
    @Override
    public double calculateFare(double distance) {
        return distance * 1.0;
    }
}
