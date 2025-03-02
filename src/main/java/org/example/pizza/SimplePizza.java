package org.example.pizza;

public class SimplePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Förbereder en grundläggande pizza...");
    }

    @Override
    public void bake() {
        System.out.println("Bakar pizza i ugnen...");
    }

    @Override
    public void cut() {
        System.out.println("Skär pizzan i bitar...");
    }

    @Override
    public void box() {
        System.out.println("Lägger pizzan i en låda...");
    }

    @Override
    public String getName() {
        return "Basic Pizza";
    }

    @Override
    public double getPrice() {
        return 79.0;
    }
}
