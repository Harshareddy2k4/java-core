package com.whileloop;

import java.util.Scanner;

//Print numbers ending with 5 within given range
public class While8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER STARTING POINT :");
		int a = sc.nextInt();
		System.out.println("ENTER ENDING POINT :");
		int b = sc.nextInt();
		while (a <= b) {
			if (a % 10 == 5) {
				System.out.print(a + " ");
			}
			a++;
		}
		sc.close();
	}

}
