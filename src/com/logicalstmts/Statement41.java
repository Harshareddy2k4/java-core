package com.logicalstmts;

//Discount based on purchase amount.
import java.util.Scanner;

public class Statement41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how much you spend on shopping :");
		double a = sc.nextDouble();
		if (a >= 10000) {
			System.out.println("you got 60 % discount and you have to pay :" + (a - a * 0.6));
		} else if (a >= 5000) {
			System.out.println("you got 40% discount and you need to pay :" + (a - a * 0.4));
		} else if (a >= 2000) {
			System.out.println("you got 20% discount and you need to pay :" + (a - a * 0.2));
		} else if (a >= 500) {
			System.out.println("you got 10% discount and you need to pay :" + (a - a * 0.1));
		} else {
			System.out.println("mana dhaggara beralu levamma");
		}
		sc.close();
	}

}
