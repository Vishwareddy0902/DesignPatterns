package org.example;

public enum Singleton {
    INSTANCE;

    int value = 0;
    public static Singleton getInstance() {
        return Singleton.INSTANCE;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
