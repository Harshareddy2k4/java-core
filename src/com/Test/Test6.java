package com.Test;
import java.util.Scanner;

public class Test6 {
    public static double calculateInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        int time = sc.nextInt();
        double simpleInterest = calculateInterest(principal, rate, time);
        System.out.println("Simple Interest = " + simpleInterest);
        sc.close();
    }
}