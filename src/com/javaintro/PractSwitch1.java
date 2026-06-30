package com.javaintro;
//switch conditions
import java.util.Scanner;

public class PractSwitch1 {

	public static void main(String[] args) {
	 System.out.println("Cricketers info!!!!");
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter jersy Number :");
	 int num = sc.nextInt();
	 switch(num) {
	 case 18 :
		 System.out.println("Kohli & Run machine & GOAT");
		 System.out.println("test runs:9230");
		 System.out.println("ODI runs:14K+ runs");
		 System.out.println("t20I runs:4k+ runs");
		 System.out.println("IPL runs:9K+ runs");
		 break;
	 case 45 :
		 System.out.println("Rohit & Hitman & Captain");
		 System.out.println("test runs:6k+");
		 System.out.println("ODI runs:10K+ runs");
		 System.out.println("t20I runs:4k+ runs");
		 System.out.println("IPL runs:6K+ runs");
		 break;
	 case 7 :
		 System.out.println("Dhoni & Thalaa & Finisher");
		 System.out.println("test runs:4k+");
		 System.out.println("ODI runs:10K+ runs");
		 System.out.println("t20I runs:1k+ runs");
		 System.out.println("IPL runs:6K+ runs");
		 break;
	 case 1 :
		 System.out.println("KL Rahul & Classyyy & Prince");
		 System.out.println("test runs:4k+");
		 System.out.println("ODI runs:3K+ runs");
		 System.out.println("t20I runs:2k+ runs");
		 System.out.println("IPL runs:5K+ runs");
		 break;
	 case 10 :
		 System.out.println("Sachin & God & GOAT");
		 System.out.println("test runs:16k+");
		 System.out.println("ODI runs:18K+ runs");
		 System.out.println("t20I runs:--- runs");
		 System.out.println("IPL runs:1K+ runs");
		 break;
		 default :
			 System.out.println("that Cricketer data is not here");
	 }

	}

}
