package org.example.parkinglot.Models;

import lombok.Data;
import org.example.parkinglot.enums.VehicleType;

import java.util.HashMap;
import java.util.Map;

@Data
public class ParkingFloor {
    private final String id;
    private final Map<String, ParkingSpot> spots = new HashMap<>();

    public ParkingFloor(String id) {
        this.id = id;
    }

    public void addSpot(ParkingSpot spot) {
        spots.put(spot.getId(), spot);
    }

    public ParkingSpot findAvailableSpot(VehicleType vehicleType) {
        for (ParkingSpot parkingSpot : spots.values()) {
            if (parkingSpot.tryOccupy(vehicleType)) {
                return parkingSpot;
            }
        }
        return null;
    }

}
