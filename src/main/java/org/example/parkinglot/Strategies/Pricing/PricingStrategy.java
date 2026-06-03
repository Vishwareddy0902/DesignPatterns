package org.example.parkinglot.Strategies.Pricing;

import org.example.parkinglot.enums.VehicleType;

import java.time.LocalDateTime;

public interface PricingStrategy {
    double calculateFee(VehicleType vehicleType, LocalDateTime entryTime, LocalDateTime exitTime);
}
