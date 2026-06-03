package org.example.parkinglot.service;

import lombok.Getter;
import lombok.Setter;
import org.example.parkinglot.Factories.PaymentStrategyFactory;
import org.example.parkinglot.Factories.PricingStrategyFactory;
import org.example.parkinglot.Models.ParkingFloor;
import org.example.parkinglot.Models.ParkingSpot;
import org.example.parkinglot.Models.Ticket;
import org.example.parkinglot.Models.Vehicles.Vehicle;
import org.example.parkinglot.Strategies.Pricing.PricingStrategy;
import org.example.parkinglot.Strategies.payment.PaymentStrategy;
import org.example.parkinglot.enums.PaymentMode;
import org.example.parkinglot.enums.PricingStrategyType;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter
public class ParkingLot {
    private static final ParkingLot INSTANCE = new ParkingLot();

    private final Map<String, ParkingFloor> floors = new HashMap<>();
    private final Map<String, Ticket> activeTickets = new HashMap<>();
    @Setter
    private PricingStrategy pricingStrategy;

    private ParkingLot() {
        this.pricingStrategy = PricingStrategyFactory.get(PricingStrategyType.TIMING_BASED);
    }

    public static ParkingLot getInstance() {
        return INSTANCE;
    }

    public void addFloor(ParkingFloor floor) {
        floors.put(floor.getId(), floor);
    }

    public Ticket parkVehicle(Vehicle vehicle, LocalDateTime entryTime) {
        for (ParkingFloor floor : floors.values()) {
            ParkingSpot spot = floor.findAvailableSpot(vehicle.getType());

            if (spot != null) {
                // Successfully reserved the spot via atomic operation
                String ticketId = UUID.randomUUID().toString();
                Ticket ticket = Ticket.builder()
                        .id(ticketId)
                        .entryTime(entryTime)
                        .vehicle(vehicle)
                        .floorId(floor.getId())
                        .lotId(spot.getId())
                        .build();

                activeTickets.put(ticketId, ticket);
                System.out.println("Vehicle parked. Ticket: " + ticketId);
                return ticket;
            }
        }

        System.out.println("No spot available for vehicle type: " + vehicle.getType());
        return null;
    }
    public void unparkVehicle(String ticketId, LocalDateTime exitTime, PaymentMode paymentMode) {
        Ticket ticket = activeTickets.get(ticketId);
        if (ticket == null) {
            System.out.println("Invalid ticket ID.");
            return;
        }

        double fee = pricingStrategy.calculateFee(
                ticket.getVehicle().getType(),
                ticket.getEntryTime(),
                exitTime
        );

        PaymentStrategy strategy = PaymentStrategyFactory.get(paymentMode);
        PaymentProcessor processor = new PaymentProcessor(strategy);
        boolean paid = processor.pay(ticket, fee);

        if (!paid) {
            System.out.println("Vehicle cannot exit. Payment unsuccessful.");
            return;
        }
        ParkingSpot spot = floors.get(ticket.getFloorId()).getSpots().get(ticket.getLotId());
        spot.vacate();
        activeTickets.remove(ticketId);

        System.out.println("Vehicle exited. Fee charged: ₹" + fee);
    }

    public void printStatus() {
        floors.forEach((floorId, floor) -> {
            System.out.println("Floor: " + floorId);
            floor.getSpots().values().forEach(spot -> {
                System.out.println(" Spot " + spot.getId() + " [" + spot.getVehicleType() + "] - " + (spot.isOccupied() ? "Occupied" : "Free"));
            });
        });
    }
}
