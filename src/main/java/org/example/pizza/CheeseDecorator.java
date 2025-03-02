package org.example.pizza;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return decoratedPizza.getName() + ", Extra Ost";
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice() + 10.0;
    }
}
