package com.operators;

import java.util.Scanner;

//Check if a student passed (marks >= 35).
public class Operators11 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a marks :");
		int a = sc.nextInt();
		String b = (a>=35)?"pass":"fail";
		System.out.println("your result is:"+b);

	}

}
