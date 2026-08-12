package com.Loops;

import java.util.Scanner;

//SMALLEST DIGIT IN GIVEN NUMBER
public class For26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int small  = a%10;
		int temp;
		for (; a != 0; a = a / 10) {
			temp = a % 10;
			if (temp < small) {
				small = temp;
			}
		}
		System.out.println(small);
		sc.close();

	}

}
