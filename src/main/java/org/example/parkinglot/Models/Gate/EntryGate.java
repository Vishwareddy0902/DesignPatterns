package org.example.parkinglot.Models.Gate;

import org.example.parkinglot.Models.Ticket;
import org.example.parkinglot.Models.Vehicles.Vehicle;
import org.example.parkinglot.enums.GateType;
import org.example.parkinglot.service.ParkingLot;

import java.time.LocalDateTime;

public class EntryGate extends Gate {

    public EntryGate(String gateId) {
        super(gateId);
    }

    @Override
    public GateType getType() {
        return GateType.ENTRY;
    }

    public Ticket parkVehicle(Vehicle vehicle, LocalDateTime entryTime) {
        return ParkingLot.getInstance().parkVehicle(vehicle, entryTime);
    }

}
