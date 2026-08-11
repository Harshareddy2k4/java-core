package com.logicalstmts;

//Check if a person is a senior citizen (age ≥ 60).
import java.util.Scanner;

public class Statement16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age :");
		int a = sc.nextInt();
		if (a >= 60) {
			System.out.println("person is a senior citizen");
		} else {
			System.out.println("person is not a senior citizen");
		}
		sc.close();
	}

}
