package com.javaintro;
//Blocks
public class PractBlock1 {
	static PractBlock1 blk1= new PractBlock1();
	static {
		System.out.println("Static block started");
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
	}
	static {
		System.out.println("Static block2 started");
	}	
		{
			System.out.println("Instace block started");
			
		}
	

}
