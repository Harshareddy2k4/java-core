package com.javaintro;
import java.util.Scanner;
public class Condition1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE AGE:");
		int age = sc.nextInt();
		if(age>18 && age<100) {
			System.out.println("YOU ARE ELIGIBLE");
		}else {
			System.out.println("PAKKAKI POYYI AADUKOMMA");
		}
			
	}
			
}
	

