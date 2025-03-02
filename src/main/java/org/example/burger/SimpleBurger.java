package org.example.burger;

public class SimpleBurger implements Burger {
    @Override
    public String getDescription() {
        return "Hamburgare";
    }

    @Override
    public double getCost() {
        return 67.0;
    }
}
