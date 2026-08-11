package com.logicalstmts;

//Child, Teenager, Adult, Senior Citizen.
import java.util.Scanner;

public class Statement40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age :");
		int a = sc.nextInt();
		if (a >= 60 && a <= 100) {
			System.out.println("you are senior citizen");
		} else if (a >= 30 && a < 60) {
			System.out.println("cheppandi uncle");
		} else if (a >= 20 && a < 30) {
			System.out.println("young and energitic");
		} else if (a < 20 && a > 0) {
			System.out.println("pilla ****");
		} else {
			System.out.println("pakkaki velli aaduko baabu");
		}
		sc.close();
	}

}
