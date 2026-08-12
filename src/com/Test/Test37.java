package com.Test;
//number digit sum
import java.util.Scanner;

public class Test37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int rem = 0;
		int sum = 0;
		while (a > 0) {
			rem = a % 10;
			a = a / 10;
			sum += rem;
		}
		System.out.println("SUM OF DIGIT" + sum);
		sc.close();
	}

}
