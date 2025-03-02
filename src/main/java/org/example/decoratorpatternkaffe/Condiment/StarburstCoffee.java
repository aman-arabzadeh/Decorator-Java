package org.example.decoratorpatternkaffe.Condiment;

import org.example.decoratorpatternkaffe.*;

public class StarburstCoffee {

    public static void main(String[] args) {

        Beverage beverage = BeverageFactory.createBeverage(BeverageType.DARKROAST);

        beverage = CondimentFactory.addCondiment(beverage, CondimentType.MOCHA);
        beverage = CondimentFactory.addCondiment(beverage, CondimentType.WHIP);

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage anotherBeverage = BeverageFactory.createBeverage(BeverageType.HOUSEBLEND);
        anotherBeverage = CondimentFactory.addCondiment(anotherBeverage, CondimentType.SOY);
        anotherBeverage = CondimentFactory.addCondiment(anotherBeverage, CondimentType.MOCHA);
        anotherBeverage = CondimentFactory.addCondiment(anotherBeverage, CondimentType.WHIP);

        System.out.println(anotherBeverage.getDescription() + " $" + anotherBeverage.cost());
    }
}
