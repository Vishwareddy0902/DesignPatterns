package org.example.Beverage.Decorators;

import org.example.Beverage.Beverage;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description() + ", Milk";
    }

    @Override
    public int cost() {
        return beverage.cost() + 10;
    }
}
