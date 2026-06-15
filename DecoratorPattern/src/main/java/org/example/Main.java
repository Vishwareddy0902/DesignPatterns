package org.example;


import org.example.Beverage.Beverage;
import org.example.Beverage.Beverages.DarkRoast;
import org.example.Beverage.Beverages.HouseBlend;
import org.example.Beverage.Decorators.Milk;
import org.example.Beverage.Decorators.Whip;

public class  Main {
    public static void main(String[] args) {
       Beverage beverage1 = new DarkRoast();
       beverage1 = new Milk(beverage1);
       System.out.println(beverage1.description());
       System.out.println(beverage1.cost());

       Beverage beverage2 = new HouseBlend();
       beverage2 = new Whip(beverage2);
       beverage2 = new Milk(beverage2);
       System.out.println(beverage2.description());
       System.out.println(beverage2.cost());
    }
}