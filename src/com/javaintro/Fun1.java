package com.javaintro;

public class Fun1 {
//pattern
	public static void main(String[] args) {
	
		        System.out.println("THANKS You 💙");
		      for (int i = 0; i < 2; i++) {

		            for (int j = 0; j < 2 - i; j++)
		                System.out.print(" ");

		            for (int j = 0; j < 2 * i + 1; j++)
		                System.out.print("*");

		            for (int j = 0; j < 3 - 2 * i; j++)
		                System.out.print(" ");

		            for (int j = 0; j < 2 * i + 1; j++)
		                System.out.print("*");

		            System.out.println();
		        }

		    
		        for (int i = 4; i >= 1; i--) {

		            for (int j = 0; j < 5 - i; j++)
		                System.out.print(" ");

		            for (int j = 0; j < 2 * i - 1; j++)
		                System.out.print("*");

		            System.out.println();
		        }

	}

}
