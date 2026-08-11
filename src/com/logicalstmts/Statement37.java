package com.logicalstmts;

import java.util.Scanner;

//Check whether a movie ticket is free for children under 5.
public class Statement37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age :");
		int a = sc.nextInt();
		if (a < 5) {
			System.out.println("movie ticket is free for you");
		} else {
			System.out.println("you have to pay money for the tickets");
		}
		sc.close();
	}

}
