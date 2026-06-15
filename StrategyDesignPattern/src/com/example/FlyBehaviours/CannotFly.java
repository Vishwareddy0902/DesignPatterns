package com.example.FlyBehaviours;

public class CannotFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("\nCannot fly");
    }
}
