package org.example.Pizzas;

import org.example.Dough.Dough;
import org.example.Sauce.Sauce;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    List<String> toppings = new ArrayList<>();

    public abstract void prepare();
    public void bake(){
        System.out.println("Baking Pizza..." + name);
    }
    public void cut(){
        System.out.println("Cutting Pizza..." + name);
    }
    public void box(){
        System.out.println("Boxing Pizza..." + name);
    }
    public void setName(String name){
        this.name = name;
    }
}
