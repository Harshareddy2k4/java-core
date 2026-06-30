package com.javaintro;

import java.util.Scanner;

public class CaseStudyP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Library Management System");

        System.out.print("Do you have a Library Card? (Yes/No): ");
        String card = sc.next();

        if (card.equalsIgnoreCase("yes")) {

            System.out.print("Enter the number of books already borrowed: ");
            int books = sc.nextInt();

            if (books >= 3) {
                System.out.println("Borrowing limit reached. You cannot borrow another book.");
            } else {

                System.out.println("Select Book Category:");
                System.out.println("1. Fiction");
                System.out.println("2. Science");
                System.out.println("3. History");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Book Issued: Fiction");
                        System.out.println("Borrowing Period: 7 days");
                        break;

                    case 2:
                        System.out.println("Book Issued: Science");
                        System.out.println("Borrowing Period: 14 days");
                        break;

                    case 3:
                        System.out.println("Book Issued: History");
                        System.out.println("Borrowing Period: 21 days");
                        break;

                    default:
                        System.out.println("Invalid Category");
                }
            }

        } else {
            System.out.println("Library card required to borrow books.");
        }

        sc.close();
    }
}

