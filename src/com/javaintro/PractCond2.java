package com.javaintro;
//nested if condition
import java.util.Scanner;

public class PractCond2 {

	public static void main(String[] args) {
		System.out.println("House Rent");
		Scanner sc = new Scanner(System.in);
		System.out.println("bachelors or not ? :");
		String bachlor = sc.nextLine();
		if (bachlor.equalsIgnoreCase("no")) {
			System.out.println("Ok Good!!");
			System.out.println("How Many People? :");
			int people = sc.nextInt();
			if(people<=5 && people>=2) {
				System.out.println("Ok Great");
				sc.nextLine();
				System.out.println("What is your Job ?? (It or NonIt):");
				String job = sc.nextLine();
				if(job.equalsIgnoreCase("It") || job.equalsIgnoreCase("NonIt")) {
					System.out.println("Ok!!!");
					System.out.println("Do You Have Bad Habits??(Yes or No)");
					String habits = sc.nextLine();
					if(habits.equalsIgnoreCase("No")) {
						System.out.println("Ok Great");
						System.out.println("So Rent Is 15000 How Much You Will Going To Pay?? :");
						int rent = sc.nextInt();
						if (rent<=15000 && rent>=13000) {
							System.out.println("OK Come And Join From Next Month First");
						}else {
							System.out.println("Sorry We Cannot Give Our Rooms At That Price");
						}
					}else {
						System.out.println("Ivvanu chal");
					}
				}else {
					System.out.println("Sorry You Are Not Affordable!!");
				}
			}else {
				System.out.println("Sorry Room Is Only for Max 5 ppl");
			}
		}else {
			System.out.println("Sorry Room Is Not For Bachelors");
		}
	}

}
