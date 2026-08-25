package com.casestudy;

import java.util.Scanner;

public class Case3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER PATIENTS :");
		int a = sc.nextInt();
		double[] b = new double[a];
		System.out.println("ENTER " + a + " TEMPARETURES :");
		for (int i = 0; i < a; i++) {
			b[i] = sc.nextDouble();
		}
		double low = b[0];
		double high = 0;
		double avg = 0;
		int count = 0;
		double sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum += b[i];
			avg = sum / a;
			if (high < b[i]) {
				high = b[i];
			} else if (low > b[i]) {
				low = b[i];
			}

			if (b[i] >= 100.4) {
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
