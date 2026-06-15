package org.example.PizzaStores;

import org.example.Pizzas.NyStyleCheesePizza;
import org.example.Pizzas.NyStylePepperoniPizza;
import org.example.Pizzas.Pizza;

public class NyPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("Cheese")){
            return new NyStyleCheesePizza();
        } else if(type.equalsIgnoreCase("Pepperoni")){
            return new NyStylePepperoniPizza();
        }
        return null;
    }
}
