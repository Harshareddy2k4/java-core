package com.logicalstmts;

//Attendance percentage category.
import java.util.Scanner;

public class Statement38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the attendance percent :");
		double a = sc.nextDouble();
		if (a >= 85 && a <= 100) {
			System.out.println("i think you are panctual ");
		} else if (a > 70 && a < 85) {
			System.out.println("Not bad bro");
		} else if (a >= 60 && a <= 70) {
			System.out.println("if you come regularly then its gonna be alright");
		} else if (a < 60 && a > 0) {
			System.out.println("gudi ki povatam better");
		} else {
			System.out.println("wrong data entered");
		}
		sc.close();
	}

}
