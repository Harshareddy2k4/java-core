package com.whileloop;

//Count even digits
import java.util.Scanner;

public class While17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		while (a > 0) {// 234
			int rem = a % 10;
			if (rem % 2 == 0) {
				System.out.print(rem + " ");
			}
			a = a / 10;
		}
		sc.close();
	}

}
