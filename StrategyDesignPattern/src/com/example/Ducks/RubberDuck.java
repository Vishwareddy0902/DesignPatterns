package com.example.Ducks;

import com.example.FlyBehaviours.CannotFly;
import com.example.QuackBehaviours.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new Squeak(), new CannotFly());
    }
}
