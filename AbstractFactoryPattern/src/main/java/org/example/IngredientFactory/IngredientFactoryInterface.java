package org.example.IngredientFactory;

import org.example.Dough.Dough;
import org.example.Sauce.Sauce;

public interface IngredientFactoryInterface {
    Dough createDough();
    Sauce createSauce();
}
