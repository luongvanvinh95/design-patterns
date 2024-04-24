package com.example.patterns.creational.builder;

public class User {
    private String name;
    private String phoneNumber;

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.getName();
        this.phoneNumber = userBuilder.getPhoneNumber();
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}


class UserBuilder {

    private String name;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public User build() {
        return new User(this);
    }
}
