package org.example.decoratorpatternkaffe;

public class BeverageFactory {
    public static Beverage createBeverage(BeverageType type) {
        if (type == null) {
            throw new IllegalArgumentException("BeverageType får inte vara null");
        }
        return switch (type) {
            case DARKROAST -> new DarkRoast();
            case HOUSEBLEND -> new HouseBlend();
            case ESPRESSO -> new Espresso();
            case DECAF -> new Decaf();
        };
    }
}
