package com.Loops;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			System.out.println("TABLE "+i);
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
		}
		sc.close();

	}

}
