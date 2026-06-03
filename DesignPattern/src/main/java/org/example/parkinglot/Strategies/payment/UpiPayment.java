package org.example.parkinglot.Strategies.payment;

import lombok.extern.slf4j.Slf4j;
import org.example.parkinglot.Models.Ticket;

@Slf4j
public class UpiPayment implements PaymentStrategy {
    @Override
    public boolean pay(Ticket ticket, double amount) {
        log.info("Paid {} for ticket id: {}, Vehicle: {} using UPI", amount,ticket.getId(), ticket.getVehicle().getNumber());
        return true;
    }
}
