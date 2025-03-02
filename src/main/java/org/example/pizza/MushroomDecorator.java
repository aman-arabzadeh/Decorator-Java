package org.example.pizza;

public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return decoratedPizza.getName() + ", Svamp";
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice() + 12.0;
    }
}
