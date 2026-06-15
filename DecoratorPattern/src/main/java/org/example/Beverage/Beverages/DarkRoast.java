package org.example.Beverage.Beverages;

import org.example.Beverage.Beverage;

public class DarkRoast extends Beverage {
    @Override
    public String description() {
        return "Dark Roast";
    }

    @Override
    public int cost() {
        return 100;
    }
}
