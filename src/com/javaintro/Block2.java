package com.javaintro;
//Blocks
public class Block2 {
	static Block2 blk = new Block2();
	static {
		System.out.println("Hello Static block");
	}

	public static void main(String[] args) {
		System.out.println("Hello Main method");
	}
		static {
			System.out.println("Hello Static2 block");
		}
		{
			System.out.println("hello instance method");
		}


}
