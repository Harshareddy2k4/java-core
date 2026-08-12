package com.Test;
//perfect number using for loop
import java.util.Scanner;

public class Test36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int i = 0;
		int ori = a;
		int rem = 0;
		while (i <= a / 2) {
			i++;
			if (a % i == 0) {
				rem += i;
			}
		}
		if (rem == ori) {
			System.out.println("IT'S A PERFECT");
		} else {
			System.out.println("IT IS NOT PERFECT");
		}
		sc.close();
	}

}
