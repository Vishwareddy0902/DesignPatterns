package org.example.Pizzas;

import org.example.IngredientFactory.IngredientFactoryInterface;

public class CheesePizza extends Pizza {

    IngredientFactoryInterface ingredientFactory;

    public CheesePizza(IngredientFactoryInterface ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza");
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        toppings.add("Cheese");
    }
}
