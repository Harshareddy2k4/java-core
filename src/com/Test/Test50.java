package com.Test;

//missing number
import java.util.Scanner;

public class Test50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT :");
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("ENTER " + a + " ELEMENTS :");
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 1; i <= a + 1; i++) {
			flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("MISSING ELEMENT :" + i);
			}

		}
		sc.close();
	}

}
