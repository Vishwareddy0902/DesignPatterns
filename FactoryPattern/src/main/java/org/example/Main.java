package org.example;

import org.example.PizzaStores.ChicagoPizzaStore;
import org.example.PizzaStores.NyPizzaStore;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var nyPizzaStore = new NyPizzaStore();
        var chicagoPizzaStore = new ChicagoPizzaStore();
        var pizza1 = nyPizzaStore.orderPizza("cheese");
        var pizza2 = nyPizzaStore.orderPizza("Pepperoni");
        var pizza3 = chicagoPizzaStore.orderPizza("cheese");
        var pizza4 = chicagoPizzaStore.orderPizza("pepperoni");
    }
}