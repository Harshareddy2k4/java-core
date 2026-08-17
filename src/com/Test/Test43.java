package com.Test;

import java.util.Random;
import java.util.Scanner;

public class Test43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int r1 = r.nextInt(1000);
		for (int i = 1; i <= 3; i++) {
			System.out.println("ENTER " + i + " TRY :");
			int a = sc.nextInt();
			if (a == r1) {
				System.out.println("CORRECT GUESS");
				break;
			} else if (i == 3) {
				System.out.println("WRONG GUESS ");
			} else {
				System.out.println("WRONG GUESS & TRY AGAIN ");
			}
			if (i == 3) {
				System.out.println("GAME COMPLETED BETTER LUCK NEXT TIME");
			}
		}
		sc.close();

	}

}
