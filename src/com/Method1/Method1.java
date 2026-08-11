package com.Method1;

import java.util.Scanner;

public class Method1 {

    static Scanner sc = new Scanner(System.in);

     void main(String[] args) {

        System.out.println("Welcome to Methods");

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        double area = GetAreaOfRectangle(l, b);

        System.out.println("Area = " + area);
    }

     double GetAreaOfRectangle(double l, double b) {
        return l * b;
    }
    
}
