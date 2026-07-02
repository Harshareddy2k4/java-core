package com.langfund;
import java.util.Scanner;

public class PractLoop6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int count = 0;
        int sum = 0;
        for (int temp = num; temp != 0; temp = temp / 10) {
            count++;
        }
        for (int temp = num; temp != 0; temp = temp / 10) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }

            sum = sum + power;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        sc.close();
    }
}
