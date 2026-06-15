package org.example.PizzaStores;

import org.example.Pizzas.ChicagoStyleCheesePizza;
import org.example.Pizzas.ChicagoStylePepperoniPizza;
import org.example.Pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }
        return null;
    }
}
