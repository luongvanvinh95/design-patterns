package com.example.patterns.creational.factory;

public class PaymentFactory {

    public static final class PAYMENT_METHOD {
        public static final String CASH = "CASH";
        public static final String PAYPAL = "PAYPAL";
        public static final String VISA = "VISA";
    }

    public Payment getPaymentMethod(String method) throws Exception {
        switch (method) {
            case PAYMENT_METHOD.CASH:
                return new CashPayment();
            case PAYMENT_METHOD.PAYPAL:
                return new PaypalPayment();
            case PAYMENT_METHOD.VISA:
                return new VisaPayment();
            default:
                throw new Exception();
        }
    }
}
