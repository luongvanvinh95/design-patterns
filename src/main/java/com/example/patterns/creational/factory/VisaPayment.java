package com.example.patterns.creational.factory;

public class VisaPayment implements Payment {
    @Override
    public void payment() {
        System.out.println("Payment by visa");
    }
}
