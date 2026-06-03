package org.example.parkinglot.Models.Vehicles;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.example.parkinglot.enums.VehicleType;

@Data
@RequiredArgsConstructor
public abstract class Vehicle {
    private final String number;
    private final VehicleType type;
}
