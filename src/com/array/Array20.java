package com.array;

import java.util.Scanner;

public class Array20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a[][] = new String[3][];
		a[0] = new String[] { "NAME ", "AGE", "PERCENTAGE" };
		a[1] = new String[3];
		a[2] = new String[3];
		System.out.println("ENTER THE STUDENT NAME :");
		a[1][0] = sc.nextLine();
		System.out.println("ENTER THE STUDENT AGE :");
		a[1][1] = sc.nextLine();
		System.out.println("ENTER THE STUDENT PERCENTAGE :");
		a[1][2] = sc.nextLine();
		System.out.println("ENTER THE STUDENT 2 NAME :");
		a[2][0] = sc.nextLine();
		System.out.println("ENTER THE STUDENT 2 AGE :");
		a[2][1] = sc.nextLine();
		System.out.println("ENTER THE STUDENT 2 PERCENTAGE :");
		a[2][2] = sc.nextLine();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
