package com.example.patterns.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        User user = User.builder().name("VinhLV").phoneNumber("123456789").build();
        System.out.println(user.toString());
    }
}
