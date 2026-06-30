package com.javaintro;
//if condition
import java.util.Scanner;

public class Fun4 {
private static String capt;

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER ONLY SMALL LETTERS NOT CAPITAL LETTERS: OK?????? ");
    capt = sc.nextLine();

    System.out.print("Enter Height: ");
    double height = sc.nextDouble();

    System.out.print("Enter Weight: ");
    double weight = sc.nextDouble();

    sc.nextLine();

    System.out.print("WHAT'S YOUR COLOR: black OR white ? ");
    String color = sc.nextLine();

    System.out.print("Enter Dressing: traditional or western ? ");
    String dressing = sc.nextLine();

    System.out.print("Enter Status: single or committed ? ");
    String status = sc.nextLine();

    System.out.print("Are You Sure About You Are Committed? (yes/no): ");
    String sure = sc.nextLine();
    if (status.equalsIgnoreCase("committed")
            && sure.equalsIgnoreCase("yes")) {

        System.out.println("Thanks for your time and enjoy the life with your boyfriend 😊");
        sc.close();
        return;
    }

    System.out.print("ARE YOU LOYAL IN RELATIONSHIP ? : yes or no ");
    String loyal = sc.nextLine();

    int score = 0;
    int totalConditions = 6;
    if (height <= 6) score++;
    if (weight <= 75) score++;
    if (dressing.equalsIgnoreCase("traditional")) score++;
    if (status.equalsIgnoreCase("single")) score++;
    if (color.equalsIgnoreCase("white")) score++;
    if (loyal.equalsIgnoreCase("yes")) score++;

    double percentage = (score * 100.0) / totalConditions;

    System.out.println("Match Percentage: " + percentage + "%");

    if (percentage >= 50) {
        System.out.println("YOU ARE SELECTED TO LOVE ME 👍");
    } else {
        System.out.println("AINA PARLE LOVE ME 😭");
    }

    sc.close();
}

}
