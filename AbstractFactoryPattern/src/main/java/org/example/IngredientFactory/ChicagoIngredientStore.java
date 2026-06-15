package org.example.IngredientFactory;

import org.example.Dough.Dough;
import org.example.Dough.ThickCrustDough;
import org.example.Sauce.PlumTomatoSauce;
import org.example.Sauce.Sauce;

public class ChicagoIngredientStore implements IngredientFactoryInterface{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}
