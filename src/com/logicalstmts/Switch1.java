package com.logicalstmts;

import java.util.Scanner;

//Shoe Store
public class Switch1 {

	public static void main(String[] args) {
		int nike_total = 0;
		int redtape_total = 0;
		int one8_total = 0;
		int royalr_total = 0;
		char ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("=============Welcome to The Only Shoe Store ===============");
			System.out.println("WHICH BRAND YOU WANT ????");
			System.out.println("1.NIKE");
			System.out.println("2.REDTAPE");
			System.out.println("3.ONE8");
			System.out.println("4.ROYAL_RANCH");
			System.out.println("ENTER YOUR BRAND NAME :");
			String brand = sc.next();
			switch (brand) {
			case "NIKE" -> {
				String choice;
				do {
					System.out.println("1.NIKE SPORT SHOES -2500");
					System.out.println("2.NIKE SNEAKERS - 3000");
					System.out.println("3.NIKE STREET WEAR SHOES-2500");
					System.out.println("4.NIKE AIRJORDAN -3500");
					System.out.println("5.NIKE SPIDY COLLAB SHOES -5000");
					System.out.println("ENTER YOUR CHOICE :");
					int model = sc.nextInt();
					switch (model) {
					case 1 -> nike_total += 2500;
					case 2 -> nike_total += 3000;
					case 3 -> nike_total += 2500;
					case 4 -> nike_total += 3500;
					case 5 -> nike_total += 5000;
					default -> System.out.println("WRONG DATA ENTERED");
					}
					System.out.println("DO YOU WANT TO ADD ANY OTHER SHOES IN NIKE BRAND (yes/no) :");
					choice = sc.next();
				} while (choice.equalsIgnoreCase("yes"));
				System.out.println("OK !!!");
			}
			case "REDTAPE" -> {
				String choice;
				do {
					System.out.println("1.REDTAPE SNEAKERS -2000");
					System.out.println("2.REDTAPE STREETWEAR SHOES -2500");
					System.out.println("3.REDTAPE SPORT SHOES-1500");
					System.out.println("4.REDTAPE CASUAL SHOES -1100");
					System.out.println("5.REDTAPE SPIDY COLLAB SHOES -5000");
					System.out.println("ENTER YOUR CHOICE :");
					int model = sc.nextInt();
					switch (model) {
					case 1 -> redtape_total += 2000;
					case 2 -> redtape_total += 2500;
					case 3 -> redtape_total += 1500;
					case 4 -> redtape_total += 1100;
					case 5 -> redtape_total += 5000;
					default -> System.out.println("WRONG ITEM ENTERED");
					}
					System.out.println("DO YOU WANT ANY OTHER SHOE IN REDTAPE (yes/no) :");
					choice = sc.next();
				} while (choice.equalsIgnoreCase("yes"));
				System.out.println("OK!!!");
			}
			case "ONE8" -> {
				String choice;
				do {
					System.out.println("1.ONE8 SPORT SHOES -9999");
					System.out.println("2.ONE8 TEST THEME SHOES -9320");
					System.out.println("3.ONE8 COVER DRIVE THEME SHOES -9999");
					System.out.println("4.ONE8 SNEAKERS -9999");
					System.out.println("5.ONE8 SPIDY COLLAB SHOES -5000");
					System.out.println("ENTER THE OPTION YOU WANT :");
					int model = sc.nextInt();
					switch (model) {
					case 1 -> one8_total += 9999;
					case 2 -> one8_total += 9320;
					case 3 -> one8_total += 9999;
					case 4 -> one8_total += 9999;
					case 5 -> one8_total += 5000;
					default -> System.out.println("WRONG ITEM ENTERED");
					}
					System.out.println("DO YOU WANT ANY OTHER SHOES IN ONE8 BRAND (yes/no) :");
					choice = sc.next();
				} while (choice.equalsIgnoreCase("yes"));
				System.out.println("OK!!!!");
			}
			case "ROYAL_RANCH" -> {
				String choice;
				do {
					System.out.println("1.ROYAL RANCH SNEAKERS -150000");
					System.out.println("2.ROYAL RANCH SPORTS -55000");
					System.out.println("3.ROYAL RANCH STREET WEAR SHOES -77000");
					System.out.println("4.ROYAL RANCH CASUAL SHOES -120000");
					System.out.println("5.ROYAL RANCH SPIDY COLLAB -5000");
					System.out.println("ENTER YOUR OPTION :");
					int model = sc.nextInt();
					switch (model) {
					case 1 -> royalr_total += 150000;
					case 2 -> royalr_total += 55000;
					case 3 -> royalr_total += 77000;
					case 4 -> royalr_total += 120000;
					case 5 -> royalr_total += 5000;
					default -> System.out.println("WRONG ITEM ENTERED");
					}
					System.out.println("DO YOU WANT ANY OTHER SHOE IN ROYAL RANCH BRAND (yes/no) :");
					choice = sc.next();
				} while (choice.equalsIgnoreCase("yes"));
				System.out.println("OK!!!");
			}
			default -> System.out.println("BRAND IS NOT THERE");
			}
			System.out.println("DO YOU WANT ANOTHER BRAND (y/n) :");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		System.out.println("OK SIR/MADAM !!!!");
		System.out.println("============TOTAL BILL========");
		System.out.println("TOTAL NIKE BILL :" + nike_total);
		System.out.println("TOTAL REDTAPE BILL :" + redtape_total);
		System.out.println("TOTAL ONE8 BILL :" + one8_total);
		System.out.println("TOTAL ROYAL RANCH BILL :" + royalr_total);
		System.out.println("TOTAL BILL :" + (nike_total + redtape_total + one8_total + royalr_total));
		sc.close();
	}

}
