package com.example.QuackBehaviours;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("\nI'm squeaking");
    }
}
