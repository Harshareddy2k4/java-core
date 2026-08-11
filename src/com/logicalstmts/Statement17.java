package com.logicalstmts;

//Check if water is boiling (temperature ≥ 100°C).
import java.util.Scanner;

public class Statement17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the tempareture :");
		double d = sc.nextDouble();
		if (d >= 100) {
			System.out.println("it reached the boiling tempareture");
		} else {
			System.out.println("it is not reached the boiling tempareture");
		}
		sc.close();

	}

}
