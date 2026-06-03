package org.example.parkinglot.Factories;

import org.example.parkinglot.Models.Vehicles.Bike;
import org.example.parkinglot.Models.Vehicles.Car;
import org.example.parkinglot.Models.Vehicles.Vehicle;
import org.example.parkinglot.enums.VehicleType;

public class VehicleFactory {
    public static Vehicle create(String number, VehicleType vehicleType) {
        return switch (vehicleType) {
            case CAR -> new Car(number);
            case BIKE -> new Bike(number);
        };
    }
}
