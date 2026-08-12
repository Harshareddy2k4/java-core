package com.Loops;

import java.util.Scanner;

//Count positive numbers.
public class For18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("ENTER HOW MANY NUMBERS YOU WANT TO ENTER :");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			System.out.println("ENTER A NUMBER :");
			int b = sc.nextInt();
			if (b > 0) {
				count++;
			}
		}
		System.out.println("COUNT OF POSITIVE NUMBERS IS :" + count);
		sc.close();
	}

}
