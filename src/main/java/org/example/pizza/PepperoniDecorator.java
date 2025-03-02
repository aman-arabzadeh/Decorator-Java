package org.example.pizza;

public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return decoratedPizza.getName() + ", Pepperoni";
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice() + 15.0;
    }
}
