package org.example.pizza;

public class DecoratorPatternPizza {
    public static void main(String[] args) {
        Pizza pizza = new SimplePizza();
        System.out.println(pizza.getName() + " kostar " + pizza.getPrice() + " kr");

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getName() + " kostar " + pizza.getPrice() + " kr");
        pizza = new PepperoniDecorator(pizza);
        System.out.println(pizza.getName() + " kostar " + pizza.getPrice() + " kr");
        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getName() + " kostar " + pizza.getPrice() + " kr");
    }
}

