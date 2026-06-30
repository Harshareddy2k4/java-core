package com.javaintro;

import java.util.Scanner;
//if else condition
public class Condition3 {
	public static void main(String[] args) {
		System.out.println("ENTER A NUMBER");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			if(num % 2 == 0) {
				System.out.println("NUMBER IS EVEN");
			}else {
				System.out.println("NUMBER IS ODD");
			}
		}
		
	}

}
