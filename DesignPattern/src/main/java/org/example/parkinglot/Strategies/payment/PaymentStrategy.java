package org.example.parkinglot.Strategies.payment;

import org.example.parkinglot.Models.Ticket;

public interface PaymentStrategy {
    boolean pay(Ticket ticket, double amount);
}
