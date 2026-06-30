package com.javaintro;
//else if condition
import java.util.Scanner;

public class AgeDes {

	public static void main(String[] args) {
		System.out.println("ENTER YOUR AGE :");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>60) {
			System.out.println("OLD AGE");
		}else if (age>35 && age<=60) {
			System.out.println("MIDDLE AGE");
		} else if (age>20 && age<=35) {
			System.out.println("YOUNG AGE");
		}else if(age>13 && age<=19) {
			System.out.println("TEENAGE");
		}else if(age>5 && age<=13) {
			System.out.println("CHILDREN");
		}else{
			System.out.println("KIDS");
		}

	}

}
