package org.example.coffee;

public class SimpleCoffee implements Coffee {
    @Override
    public double getPrice() {
        return 30.0;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
