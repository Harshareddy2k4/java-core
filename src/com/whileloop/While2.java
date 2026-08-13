package com.whileloop;

//Count numbers from 1 to N
import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER :");
		int a = sc.nextInt();
		int i = 1;
		int count = 0;
		while (i <= a) {
			count++;
			i++;
		}
		System.out.println("TOTAL COUNT IS :" + count);
		sc.close();
	}

}
