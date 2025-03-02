package org.example.coffee;

public class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public double getPrice() {
        return coffee.getPrice();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}
