package com.casestudy;

import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER HOW MANY STUDENTS YOU WANT :");
		int a = sc.nextInt();
		int passcount = 0;
		int count = 1;
		int failcount = 0;
		double high = 0;
		while (count <= a) {
			System.out.println("ENTER " + count + " STUDENT MARKS :");
			double b = sc.nextDouble();
			if (b < 40 && b >= 0) {
				failcount++;
			} else if (b >= 40 && b <= 100) {
				passcount++;
			} else {
				System.out.println("WRONG DATA ENTERED ");
				count--;
			}
			if (b > high) {
				if (b <= 100 && b >= 0) {
					high = b;
				}
			}
			count++;
		}
		System.out.println("NUMBER OF STUDENTS PASSED :" + passcount);
		System.out.println("NUMBER OF STUDENTS FAILED :" + failcount);
		System.out.println("HIGHEST MARKS IN CLASS IS :" + high);
		sc.close();
	}

}
