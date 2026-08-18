package com.Test;

import java.util.Scanner;

public class Test42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int power = 0;
		int temp = a;
		int squ = a * a;
		int count = 0;
		while (a != 0) {
			a = a / 10;
			count++;
		}
		power = Math.powExact(10, count);
		if (squ % power == temp) {
			System.out.println("ITS AUTOMORPHIC NUMBER ");
		} else {
			System.out.println("ITS NOT AUTOMORPHIC NUMBER");
		}
		sc.close();
	}

}
