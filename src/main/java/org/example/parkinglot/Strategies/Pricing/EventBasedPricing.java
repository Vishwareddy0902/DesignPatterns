package org.example.parkinglot.Strategies.Pricing;

import org.example.parkinglot.enums.VehicleType;

import java.time.LocalDateTime;

public class EventBasedPricing implements PricingStrategy{

    @Override
    public double calculateFee(VehicleType vehicleType, LocalDateTime entryTime, LocalDateTime exitTime) {
        return switch (vehicleType) {
            case CAR -> 100.0;
            case BIKE -> 50.0;
        };
    }
}
