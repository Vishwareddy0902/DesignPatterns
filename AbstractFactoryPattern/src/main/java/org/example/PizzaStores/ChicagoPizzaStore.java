package org.example.PizzaStores;

import org.example.IngredientFactory.ChicagoIngredientStore;
import org.example.Pizzas.CheesePizza;
import org.example.Pizzas.PepperoniPizza;
import org.example.Pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

    ChicagoIngredientStore chicagoIngredientStore = new ChicagoIngredientStore();

    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            var pizza = new CheesePizza(chicagoIngredientStore);
            pizza.setName("Chicago Cheese Pizza");
            return pizza;
        } else if (type.equalsIgnoreCase("pepperoni")) {
            var pizza = new PepperoniPizza(chicagoIngredientStore);
            pizza.setName("Chicago Pepperoni Pizza");
            return pizza;
        }
        return null;
    }
}
