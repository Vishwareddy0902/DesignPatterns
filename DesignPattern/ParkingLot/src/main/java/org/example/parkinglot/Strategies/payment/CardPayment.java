package org.example.parkinglot.Strategies.payment;

import lombok.extern.slf4j.Slf4j;
import org.example.parkinglot.Models.Ticket;

@Slf4j
public class CardPayment implements PaymentStrategy {

    @Override
    public boolean pay(Ticket ticket, double amount) {
        log.info("Paid {} for ticket id: {}, Vehicle: {} using CARD", amount,ticket.getId(), ticket.getVehicle().getNumber());
        return true;
    }
}
