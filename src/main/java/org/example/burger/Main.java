package org.example.burger;

import java.util.EnumSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        valjaHamburgareTopping();
    }
    public static void meny() {
        System.out.println("""
                ==============================
                     VÄLKOMMEN TILL BURGER SHOP!
                ==============================
                Välj dina toppings:
                1️  Extra Ost 
                2️  Extra Kött 
                3️  Sallad 
                4️  Färdig beställning
                ==============================
                Skriv numret på en topping och tryck ENTER.
                Skriv '4' när du är klar.
                """);
    }

    public static void valjaHamburgareTopping() {
        Scanner scanner = new Scanner(System.in);
        Set<BurgerTopping> selectedToppings = EnumSet.noneOf(BurgerTopping.class);
        meny();

        while (true) {
            System.out.print("Ditt val: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ogiltig inmatning! Skriv en siffra mellan 1-4.");
                scanner.next();
                continue;
            }

            int val = scanner.nextInt();

            switch (val) {
                case 1 -> laggTillTopping(selectedToppings, BurgerTopping.CHEESE, "Extra Ost tillagd!");
                case 2 -> laggTillTopping(selectedToppings, BurgerTopping.EXTRA_KOTT, "Extra Kött tillagd!");
                case 3 -> laggTillTopping(selectedToppings, BurgerTopping.SALLAD, "Sallad tillagd!");
                case 4 -> {
                    System.out.println("\nDin burgare är klar!");
                    Burger bestalldBurgare = BurgerFactory.createBurger(selectedToppings);
                    System.out.println(bestalldBurgare.getDescription() + " kostar " + bestalldBurgare.getCost() + " kr.");
                    System.out.println("Tack för ditt köp!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("⚠Ogiltigt val. Välj ett nummer mellan 1-4.");
            }
        }
    }

    private static void laggTillTopping(Set<BurgerTopping> toppings, BurgerTopping topping, String message) {
        if (toppings.add(topping)) {
            System.out.println(message);
        } else {
            System.out.println(topping + " är redan vald!");
        }
    }
}
