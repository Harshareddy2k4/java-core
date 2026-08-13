package com.whileloop;
//Find sum of numbers from 1 to N
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int b = 0;
		int sum = 0;
		while (a > b) {
			b++;
			sum += b;
		}
		System.out.println("SUM OF N NUMBERS ARE :" + sum);
		sc.close();

	}

}
