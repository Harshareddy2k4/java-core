package com.casestudy;

import java.util.Scanner;

public class Case3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER PATIENTS :");
		int a = sc.nextInt();
		int[] b = new int[a];
		System.out.println("ENTER " + a + " TEMPARETURES :");
		for (int i = 0; i < a; i++) {
			b[i] = sc.nextInt();
		}
		int low = b[0];
		int high = 0;
		int avg = 0;
		int count = 0;
		int sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum += b[i];
			avg = sum / a;
			if (high < b[i]) {
				high = b[i];
			}

			if (low > b[i]) {
				low = b[i];
			}

			if (b[i] >= 100) {
				count++;
			}

		}
		System.out.println("HIGHEST TEMPARETURE :" + high);
		System.out.println("LOWEST TEMPARETURE :" + low);
		System.out.println("NUMBER OF PATIENTS HAVE MORE THAN 100F :" + count);
		System.out.println("AVERAAGE TEMPARETURE :" + avg);
		sc.close();

	}

}
