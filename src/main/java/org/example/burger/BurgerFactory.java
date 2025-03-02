package org.example.burger;

import java.util.Set;

public class BurgerFactory {
    public static Burger createBurger(Set<BurgerTopping> toppings) {
        Burger burger = new SimpleBurger();

        for (BurgerTopping topping : toppings) {
            switch (topping) {
                case CHEESE -> burger = new CheeseDecorator(burger);
                case EXTRA_KOTT -> burger = new ExtraKottDecorator(burger);
                case SALLAD -> burger = new SalladDecorator(burger);
            }
        }

        return burger;
    }
}
