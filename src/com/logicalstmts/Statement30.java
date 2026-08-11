package com.logicalstmts;

//Checking mobile battery
import java.util.Scanner;

public class Statement30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter battery percentage :");
		int a = sc.nextInt();
		if (a > 90 && a <= 100) {
			System.out.println("no need to charge your battery");
		} else if (a > 70 && a <= 90) {
			System.out.println("no problem still you got more battery");
		} else if (a > 50 && a <= 70) {
			System.out.println("just around 50% charge is over");
		} else if (a > 20 && a <= 50) {
			System.out.println("your charge is little bit low");
		} else if (a > 0 && a <= 20) {
			System.out.println("your charge is too low so, plse charge your phone");
		} else {
			System.out.println("data sakkaga enter chey");
		}
		sc.close();
	}

}
