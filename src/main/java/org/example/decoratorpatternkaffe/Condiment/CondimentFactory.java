package org.example.decoratorpatternkaffe.Condiment;

import org.example.decoratorpatternkaffe.Beverage;

public class CondimentFactory {
    public static Beverage addCondiment(Beverage beverage, CondimentType type) {
        if (beverage == null) {
            throw new IllegalArgumentException("Drycken får inte vara null");
        }
        return switch (type) {
            case MOCHA -> new Mocha(beverage);
            case WHIP -> new Whip(beverage);
            case SOY -> new Soy(beverage);
            case STEAMED_MILK -> new SteamedMilk(beverage);
        };
    }
}
