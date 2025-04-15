package com.Pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the size of the sandwich");
        System.out.println("Regular base price $5.45 (enter 1) ");
        System.out.println("Large base price $8.95 (enter 2) ");
        int sandwichSize = scanner.nextInt();

        double basePrice = 0.0;
        if (sandwichSize == 1) {
            basePrice = 5.45;
        } else if (sandwichSize == 2) {
            basePrice = 8.95;

        }


        System.out.println("Please enter your age here: ");
        int age = scanner.nextInt();

        double discount = 0.0;
        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }

        double finalPrice = basePrice - (basePrice * discount);
        System.out.println("Total price: $" + finalPrice);





    }



    }

