package com.example.patterns.creational.factory;

public class FactoryMain {
    public static void main(String[] args) throws Exception {
        PaymentFactory paymentFactory = new PaymentFactory();
        Payment payment = paymentFactory.getPaymentMethod(PaymentFactory.PAYMENT_METHOD.CASH);
        payment.payment();
    }
}
