package org.example.coffee;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getPrice());
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getPrice());
        coffee = new ChocolateCoffee(coffee);
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getPrice());
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getPrice());
    }
}
