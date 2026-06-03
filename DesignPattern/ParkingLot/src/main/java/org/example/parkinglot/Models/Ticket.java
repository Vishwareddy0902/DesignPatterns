package org.example.parkinglot.Models;

import lombok.Builder;
import lombok.Data;
import org.example.parkinglot.Models.Vehicles.Vehicle;
import org.example.parkinglot.enums.PaymentStatus;

import java.time.LocalDateTime;

@Data
@Builder
public class Ticket {
    private String id;
    private LocalDateTime entryTime;
    private String floorId;
    private String lotId;
    private Vehicle vehicle;
    private PaymentStatus paymentStatus;
}
