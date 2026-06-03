package org.example.parkinglot.service;

import org.example.parkinglot.Models.Ticket;
import org.example.parkinglot.Strategies.payment.PaymentStrategy;
import org.example.parkinglot.enums.PaymentStatus;

public class PaymentProcessor {
    private final PaymentStrategy strategy;

    public PaymentProcessor(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean pay(Ticket ticket, double amount) {
        boolean success = strategy.pay(ticket, amount);
        if (success) {
            ticket.setPaymentStatus(PaymentStatus.SUCCESS);
        } else {
            ticket.setPaymentStatus(PaymentStatus.FAILED);
            System.out.println("Payment failed for ticket: " + ticket.getId());
        }
        return success;
    }
}
