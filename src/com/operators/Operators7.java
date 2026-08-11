package com.operators;

public class Operators7 {
//	Check if a character is a vowel or consonant.
	public static void main(String[] args) {
		char a = 'B';
		String b = (a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='0'||a=='u')?"Vowels":"Consonants";
		System.out.println("the given string is :"+b);
	}

}
