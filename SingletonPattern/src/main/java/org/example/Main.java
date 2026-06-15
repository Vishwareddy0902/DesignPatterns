package org.example;

public class Main {
    public static void main(String[] args) {
        var instance1 = Singleton.getInstance();
        var instance2 = Singleton.getInstance();
        instance1.setValue(1);
        System.out.println(instance2.getValue());
        instance2.setValue(2);
        System.out.println(instance1.getValue());
    }
}