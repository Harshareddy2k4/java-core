package com.logicalstmts;

//Gym Membership level (Silver, Gold, Platinum).
import java.util.Scanner;

public class Statement42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter which membership level you want to take:");
		String a = sc.next();
		if (a.equalsIgnoreCase("silver")) {
			System.out.println("you have to pay 7000 per year");
		} else if (a.equalsIgnoreCase("gold")) {
			System.out.println("you have to pay 10000 per yearly");
		} else if (a.equalsIgnoreCase("platinum")) {
			System.out.println("you have to pay 15000 per yearly");
		} else {
			System.out.println("invalid membership entered");
		}
		sc.close();
	}

}
