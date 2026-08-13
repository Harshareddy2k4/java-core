package com.whileloop;

//Find sum of even and odd numbers from 1 to N
import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int i = 1;
		int even = 0;
		int odd = 0;
		while (i <= a) {
			if (i % 2 == 0) {
				even += i;
			}else if (i % 2 == 1) {
				odd += i;
			}
			i++;
		}
		System.out.println("SUM OF EVEN NUMBERS :" + even);
		System.out.println("SUM OF ODD NUMBERS :" + odd);
		sc.close();
	}

}
