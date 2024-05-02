package com.example.patterns.structural.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("WildTurkey gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey fly");
    }
}
