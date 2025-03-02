package org.example.coffee;

public class ChocolateCoffee extends CoffeeDecorator {
    public ChocolateCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chocolate";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 7.0;
    }
}
