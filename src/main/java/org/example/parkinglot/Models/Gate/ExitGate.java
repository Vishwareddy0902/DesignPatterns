package org.example.parkinglot.Models.Gate;

import org.example.parkinglot.enums.GateType;
import org.example.parkinglot.enums.PaymentMode;
import org.example.parkinglot.service.ParkingLot;

import java.time.LocalDateTime;

public class ExitGate extends Gate {

    public ExitGate(String gateId) {
        super(gateId);
    }

    @Override
    public GateType getType() {
        return GateType.EXIT;
    }

    public void unParkVehicle(String ticketId, LocalDateTime exitTime, PaymentMode paymentMode) {
        ParkingLot.getInstance().unparkVehicle(ticketId, exitTime, paymentMode);
    }
}
