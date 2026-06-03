package org.example.parkinglot.Models.Vehicles;

import org.example.parkinglot.enums.VehicleType;

public class Car extends Vehicle {
    public Car(String number) {
        super(number, VehicleType.CAR);
    }
}
