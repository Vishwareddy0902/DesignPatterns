package com.example;

import com.example.Ducks.MallardDuck;
import com.example.Ducks.RubberDuck;

public class Main {
    public static void main(String[] args) {
        var mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();

        var rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.quack();
    }
}