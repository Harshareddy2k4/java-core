package com.logicalstmts;

//Check if a person is eligible to vote, then check if they can contest elections.
import java.util.Scanner;

public class Nested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age :");
		int a = sc.nextInt();
		if (a >= 18 && a < 100) {
			System.out.println("you are eligible for voting");
			System.out.println("are you voted before (yes/No):");
			String s = sc.next();
			if (s.equalsIgnoreCase("yes")) {
				System.out.println("thats great ");
				System.out.println("do you want to participate in next elections(yes/no)");
				String s1 = sc.next();
				if (s1.equalsIgnoreCase("yes")) {
					System.out.println("thats great !!!!");
					System.out.println("which party you think better (x/y) :");
					char c = sc.next().charAt(0);
					if (c == 'y' || c == 'Y') {
						System.out.println("thats great and good luck");
					} else {
						System.out.println("thats great to hear and good luck");
					}
				} else {
					System.out.println("inkendhuku raa voter id neeku");
				}
			} else {
				System.out.println("oh i think upcoming is your first one,good luck ");
			}
		} else {
			System.out.println("baabu pakkaki velli aaduko amma");
		}
		sc.close();
	}

}
