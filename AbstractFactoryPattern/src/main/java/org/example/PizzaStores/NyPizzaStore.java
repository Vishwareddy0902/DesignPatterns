package org.example.PizzaStores;

import org.example.IngredientFactory.NyIngredientFactory;
import org.example.Pizzas.CheesePizza;
import org.example.Pizzas.PepperoniPizza;
import org.example.Pizzas.Pizza;

public class NyPizzaStore extends PizzaStore {

    NyIngredientFactory nyIngredientFactory = new NyIngredientFactory();

    @Override
    protected Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("Cheese")){
            var pizza =  new CheesePizza(nyIngredientFactory);
            pizza.setName("NY Cheese Pizza");
            return pizza;
        } else if(type.equalsIgnoreCase("Pepperoni")){
            var pizza =  new PepperoniPizza(nyIngredientFactory);
            pizza.setName("NY Pepperoni Pizza");
            return pizza;
        }
        return null;
    }
}
