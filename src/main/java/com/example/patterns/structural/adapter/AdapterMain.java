package com.example.patterns.structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quack();
    }
}
