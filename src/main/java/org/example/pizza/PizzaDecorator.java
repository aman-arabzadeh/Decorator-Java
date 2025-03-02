package org.example.pizza;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza pizza) {
        this.decoratedPizza = pizza;
    }

    @Override
    public void prepare() {
        decoratedPizza.prepare();
    }

    @Override
    public void bake() {
        decoratedPizza.bake();
    }

    @Override
    public void cut() {
        decoratedPizza.cut();
    }

    @Override
    public void box() {
        decoratedPizza.box();
    }

    @Override
    public String getName() {
        return decoratedPizza.getName();
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice();
    }
}
