package org.example.parkinglot.Strategies.Pricing;

import org.example.parkinglot.enums.VehicleType;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeBasedPricing implements PricingStrategy{

    @Override
    public double calculateFee(VehicleType vehicleType, LocalDateTime entryTime, LocalDateTime exitTime) {
        long durationMinutes = Duration.between(entryTime, exitTime).toMinutes();
        long totalHours = (long) Math.ceil(durationMinutes / 60.0);
        double price = switch (vehicleType) {
            case BIKE -> 50.0;
            case CAR -> 100.0;
        };
        return price*totalHours;
    }
}
