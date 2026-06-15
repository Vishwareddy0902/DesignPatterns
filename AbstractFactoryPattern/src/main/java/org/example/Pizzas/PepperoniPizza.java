package org.example.Pizzas;

import org.example.IngredientFactory.IngredientFactoryInterface;

public class PepperoniPizza extends Pizza {

    IngredientFactoryInterface ingredientFactory;

    public PepperoniPizza(IngredientFactoryInterface ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        toppings.add("pepperoni");
    }
}
