package org.example.Beverage.Beverages;

import org.example.Beverage.Beverage;

public class HouseBlend extends Beverage {
    @Override
    public String description() {
        return "House Blend";
    }

    @Override
    public int cost() {
        return 80;
    }
}
