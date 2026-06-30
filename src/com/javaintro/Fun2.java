package com.javaintro;
import java.util.Scanner;
//if condition
public class Fun2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Step 1: Enter Height");
        int height = sc.nextInt();

        System.out.println("Step 2: Enter Weight");
        int weight = sc.nextInt();

        sc.nextLine();

        System.out.println("Step 3: Enter Personality");
        String personality = sc.nextLine();

        if (height == 6 && weight == 75 &&
            personality.equals("Baahubali")) {

            System.out.println("NUVVU HERO RAA");
        } else {
            System.out.println("PERSONALITY DOESN'T MATTER.. YOU ARE HERO");
        }

        sc.close();
    }
}
