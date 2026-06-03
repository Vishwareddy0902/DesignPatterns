package org.example.parkinglot.Models.Vehicles;

import org.example.parkinglot.enums.VehicleType;

public class Bike extends Vehicle {
    public Bike(String number) {
        super(number, VehicleType.BIKE);
    }
}
