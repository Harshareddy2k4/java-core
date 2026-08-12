package com.Loops;

import java.util.Scanner;

public class For37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A VALUE :");
		int a = sc.nextInt();
		System.out.println("ENTER B VALUE :");
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("A VALUE IS :"+a);
		System.out.println("B VALUE IS :"+b);
		a=a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("A VALUE IS :"+a);
		System.out.println("B VALUE IS :"+b);
		sc.close();
	}

}
