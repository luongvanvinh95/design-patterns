package com.example.patterns.creational.singleton;

import java.util.Objects;

public class Singleton {
    private String value;
    private static Singleton singleton;

    public static Singleton getInstance() {
        if (Objects.isNull(singleton)) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void copy(String value) {
        this.value = value;
    }

    public void paste() {
        System.out.println("Paste: " + this.value);
    }
}
