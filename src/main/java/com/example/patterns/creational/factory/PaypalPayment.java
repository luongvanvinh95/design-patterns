package com.example.patterns.creational.factory;

public class PaypalPayment implements Payment {
    @Override
    public void payment() {
        System.out.println("Payment by paypal");
    }
}
