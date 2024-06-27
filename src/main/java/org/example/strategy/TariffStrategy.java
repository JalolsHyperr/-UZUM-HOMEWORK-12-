package org.example.strategy;

/**
 * Интерфейс для стратегии тарифа.
 * Определяет метод для расчета стоимости поездки.
 */
public interface TariffStrategy {
    double calculateFare(double distance);
}
