package org.example.IngredientFactory;

import org.example.Dough.Dough;
import org.example.Dough.ThinCrustDough;
import org.example.Sauce.MarinaraSauce;
import org.example.Sauce.Sauce;

public class NyIngredientFactory implements IngredientFactoryInterface {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
