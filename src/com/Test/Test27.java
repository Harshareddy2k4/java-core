package com.Test;

import java.util.Scanner;

public class Test27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int pow = a * a;
		int sum = 0;
		for (; pow != 0; pow = pow / 10) {
			sum += pow % 10;
		}
		if (sum == a) {
			System.out.println("ITS A NEON NUMBER ");
		} else {
			System.out.println("ITS NOT A NEON NUMBER");
		}
		sc.close();
	}

}
