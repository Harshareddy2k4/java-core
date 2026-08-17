package com.whileloop;


//Print numbers starting with 1
import java.util.Scanner;

public class While9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER STARTING POINT :");
		int a = sc.nextInt();
		System.out.println("ENTER ENDING POINT :");
		int b = sc.nextInt();
		int rem = 0;
		while (a <= b) {
			rem = a;
			while (rem >= 10) {
				rem = rem / 10;
			}
			if (rem == 1) {
				System.out.println(a);
			}
			a++;
		}
		sc.close();
	}

}
