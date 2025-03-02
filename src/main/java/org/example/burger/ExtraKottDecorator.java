package org.example.burger;

public class ExtraKottDecorator extends BurgerDecorator {
    public ExtraKottDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return decoratedBurger.getDescription() + ", Extra Kött";
    }

    @Override
    public double getCost() {
        return decoratedBurger.getCost() + 20.0;
    }
}
