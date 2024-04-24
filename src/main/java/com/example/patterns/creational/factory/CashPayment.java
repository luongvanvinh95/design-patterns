package com.example.patterns.creational.factory;

public class CashPayment implements Payment {
    @Override
    public void payment() {
        System.out.println("Payment by cash");
    }
}
