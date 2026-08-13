package com.Test;
//largest digit using while loop
import java.util.Scanner;

public class Test40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int temp = 0;
		int rem = 0;
		while (a != 0) {
			rem = a % 10;
			a = a / 10;
			if (rem > temp) {
				temp = rem;
			}
		}
		System.out.println("LARGEST DIGIT :" + temp);
		sc.close();
	}

}
