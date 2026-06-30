package com.javaintro;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nmuner");
		int a = sc.nextInt();
		System.out.println("enter another number");
		int a1 = sc.nextInt();
		System.out.println("enter a arithmatic symbol");
		String smb = sc.next();
		double result = 0;

		switch(smb) {
		case "+" ->result = a+a1;
		case "-" ->result = a-a1;
		case "*" ->result = a*a1;
		case "%" ->result = a%a1;
		case "/" ->result = a/a1;
		default ->System.out.println("thappu beteee");
		}
		System.out.println("result :"+result);
		
	}

}
