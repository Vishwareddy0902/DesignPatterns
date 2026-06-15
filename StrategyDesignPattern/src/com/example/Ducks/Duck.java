package com.example.Ducks;

import com.example.FlyBehaviours.FlyBehaviour;
import com.example.QuackBehaviours.QuackBehaviour;

public abstract class Duck {
    private final QuackBehaviour quackBehaviour;
    private final FlyBehaviour flyBehaviour;
    protected Duck(QuackBehaviour quackBehaviour, FlyBehaviour flyBehaviour) {
        this.quackBehaviour = quackBehaviour;
        this.flyBehaviour = flyBehaviour;
    }
    public void quack() {
        quackBehaviour.quack();
    }
    public void fly() {
        flyBehaviour.fly();
    }
}
