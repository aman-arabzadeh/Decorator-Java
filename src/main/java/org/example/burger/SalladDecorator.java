package org.example.burger;
public class SalladDecorator extends BurgerDecorator {
    public SalladDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return decoratedBurger.getDescription() + ", Sallad";
    }

    @Override
    public double getCost() {
        return decoratedBurger.getCost() + 5.0;
    }
}
