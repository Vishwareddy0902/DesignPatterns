package org.example.parkinglot.Models;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.example.parkinglot.enums.VehicleType;

import java.util.concurrent.atomic.AtomicBoolean;

@Data
@RequiredArgsConstructor
public class ParkingSpot {
    private final String id;
    private final VehicleType vehicleType;
    private AtomicBoolean occupied =  new AtomicBoolean(false);

    public boolean tryOccupy(VehicleType vehicleType) {
        if (vehicleType != this.vehicleType) {
            return false;
        }

        return occupied.compareAndSet(false, true);
    }

    public void vacate() {
        occupied.set(false);
    }

    public boolean isOccupied() {
        return occupied.get();
    }
}
