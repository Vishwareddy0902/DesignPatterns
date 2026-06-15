package org.example.Pizzas;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("Preparing Pizza..." + name);
        System.out.println("Preparing Pizza..." + dough);
        System.out.println("Preparing Pizza..." + sauce);
        System.out.println("Preparing Pizza..." + toppings);
    }
    public void bake(){
        System.out.println("Baking Pizza..." + name);
    }
    public void cut(){
        System.out.println("Cutting Pizza..." + name);
    }
    public void box(){
        System.out.println("Boxing Pizza..." + name);
    }
}
