package com.whileloop;

//Print the multiplication table of a number
import java.util.Scanner;

public class While5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER WHICH TABLE YOU WANT :");
		int a = sc.nextInt();
		int i = 1;
		while (i <= 10 && i >= 0) {
			System.out.println(a + " X " + i + " = " + (a * i));
			i++;
		}
		sc.close();

	}

}
