package com.javaintro;

import java.util.Scanner;

public class PractSwitch3 {

    public static void main(String[] args) {

        System.out.println("Welcome Restaurant");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item type (veg/nonveg): ");
        String type = sc.next();

        int vegtotal = 0;
        int nonVegTotal = 0;

        switch (type.toLowerCase()) {

        case "veg" -> {
            String choice;

            do {
                System.out.println("\n----- Veg Menu -----");
                System.out.println("1. Paneer - 180");
                System.out.println("2. Veg Salad - 280");
                System.out.println("3. Brooklyn - 280");
                System.out.println("4. Veg Meals - 150");
                System.out.println("5. Paneer Roast - 180");

                System.out.print("Enter item number: ");
                int item = sc.nextInt();

                switch (item) {
                case 1 -> vegtotal += 180;
                case 2 -> vegtotal += 280;
                case 3 -> vegtotal += 280;
                case 4 -> vegtotal += 150;
                case 5 -> vegtotal += 180;
                default -> System.out.println("Invalid veg item");
                }

                System.out.print("Do you want to add another item? (y/n): ");
                choice = sc.next();

            } while (choice.equalsIgnoreCase("y"));
        }

        case "nonveg" -> {
            String choice;

            do {
                System.out.println("\n----- Non-Veg Menu -----");
                System.out.println("1. Chicken 65 - 280");
                System.out.println("2. Chilli Chicken - 380");
                System.out.println("3. Chicken Lollipop - 280");
                System.out.println("4. Butter Chicken - 250");
                System.out.println("5. Afghani Chicken - 280");
                System.out.println("6. Chicken Masala - 290");
                System.out.println("7. Fried Chicken - 290");

                System.out.print("Enter item number: ");
                int item = sc.nextInt();

                switch (item) {
                case 1 -> nonVegTotal += 280;
                case 2 -> nonVegTotal += 380;
                case 3 -> nonVegTotal += 280;
                case 4 -> nonVegTotal += 250;
                case 5 -> nonVegTotal += 280;
                case 6 -> nonVegTotal += 290;
                case 7 -> nonVegTotal += 290;
                default -> System.out.println("Invalid non-veg item");
                }

                System.out.print("Do you want to add another item? (y/n): ");
                choice = sc.next();

            } while (choice.equalsIgnoreCase("y"));
        }

        default -> System.out.println("Item type not available");
        }

        System.out.println("\n========== BILL ==========");
        System.out.println("Veg Items Total     : " + vegtotal);
        System.out.println("Non-Veg Items Total : " + nonVegTotal);
        System.out.println("Total Bill          : " + (vegtotal + nonVegTotal));
        System.out.println("==========================");

        sc.close();
    }
}