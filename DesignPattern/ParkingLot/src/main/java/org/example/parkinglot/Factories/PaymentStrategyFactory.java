package org.example.parkinglot.Factories;

import org.example.parkinglot.Strategies.payment.CardPayment;
import org.example.parkinglot.Strategies.payment.CashPayment;
import org.example.parkinglot.Strategies.payment.PaymentStrategy;
import org.example.parkinglot.Strategies.payment.UpiPayment;
import org.example.parkinglot.enums.PaymentMode;

public class PaymentStrategyFactory {
    public static PaymentStrategy get(PaymentMode paymentMode) {
        return switch (paymentMode) {
            case CASH -> new CashPayment();
            case UPI -> new UpiPayment();
            case CARD -> new CardPayment();
        };
    }
}
