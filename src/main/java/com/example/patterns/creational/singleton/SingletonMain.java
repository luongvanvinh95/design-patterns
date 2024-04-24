package com.example.patterns.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.copy("Copy 1");
        singleton2.copy("Copy 2");

        singleton1.paste();
        singleton2.paste();
    }
}
