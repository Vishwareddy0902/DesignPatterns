package com.example.Ducks;

import com.example.FlyBehaviours.FlyWithWings;
import com.example.QuackBehaviours.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        super(new Quack(), new FlyWithWings());
    }
}
