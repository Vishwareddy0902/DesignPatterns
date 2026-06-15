package org.example.Beverage.Decorators;

import org.example.Beverage.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description() + ", Whip";
    }

    @Override
    public int cost() {
        return beverage.cost() + 20;
    }
}