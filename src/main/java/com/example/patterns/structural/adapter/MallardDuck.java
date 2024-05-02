package com.example.patterns.structural.adapter;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("MallardDuck Quack Quack");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck Fly");
    }
}
