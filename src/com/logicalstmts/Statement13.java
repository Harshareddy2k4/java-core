package com.logicalstmts;

//Check if a person is eligible to driving (18+).
import java.util.Scanner;

public class Statement13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int a = sc.nextInt();
		if (a >= 18) {
			System.out.println("vehicle is ready to drive");
		} else {
			System.out.println("velli cycle thokkukoo");
		}
		sc.close();
	}

}
