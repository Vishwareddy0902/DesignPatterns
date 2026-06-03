package org.example.parkinglot.Factories;

import org.example.parkinglot.Strategies.Pricing.EventBasedPricing;
import org.example.parkinglot.Strategies.Pricing.PricingStrategy;
import org.example.parkinglot.Strategies.Pricing.TimeBasedPricing;
import org.example.parkinglot.enums.PricingStrategyType;

public class PricingStrategyFactory {
    public static PricingStrategy get(PricingStrategyType pricingStrategyType) {
        return switch (pricingStrategyType) {
            case EVENT_BASED -> new EventBasedPricing();
            case TIMING_BASED ->  new TimeBasedPricing();
        };
    }
}
