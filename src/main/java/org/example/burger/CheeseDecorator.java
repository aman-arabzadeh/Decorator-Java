package org.example.burger;

public class CheeseDecorator extends BurgerDecorator {
    public CheeseDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return decoratedBurger.getDescription() + ", Extra Ost";
    }

    @Override
    public double getCost() {
        return decoratedBurger.getCost() + 6.0;
    }
}
