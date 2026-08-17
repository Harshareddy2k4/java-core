package com.whileloop;

import java.util.Scanner;

//Reverse a number
public class While15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int rev = 0;
		boolean neg = true;
		if(a<0) {
			neg = true;
			a=-a;
		}
		while(a>0) {
			int rem = a%10;
			a=a/10;
			rev = rev*10+rem;
		}
		if(neg) {
			rev= -rev;
		}
		System.out.println("REVERSE OF A NUMBER :"+rev);
		sc.close();
	}

}
