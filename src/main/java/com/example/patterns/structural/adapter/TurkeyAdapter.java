package com.example.patterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Convert turkey to duck
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
