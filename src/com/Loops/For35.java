package com.Loops;

//amstrong number
import java.util.Scanner;

public class For35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int count = 0;
		int temp = a;
		int ori = a;
		double sum = 0;
		int digit = 0;
		for (; a != 0; a = a / 10) {
			count++;
		}
		for (; temp != 0; temp = temp / 10) {
			digit = temp % 10;
			sum += Math.pow(digit, count);
		}
		if (sum == ori) {
			System.out.println("ARMSTRONG");
		} else {
			System.out.println("NOT A AMSTRONG");
		}
		sc.close();
	}

}
