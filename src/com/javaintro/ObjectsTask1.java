package com.javaintro;

public class ObjectsTask1 {
	static int count =0;
	{
		count++;
	}
	public static void main(String[] args) {
		ObjectsTask1 obj = new ObjectsTask1();
		ObjectsTask1 obj1 = new ObjectsTask1();
		ObjectsTask1 obj2 = new ObjectsTask1();
		System.out.println("object count is :"+count);
	}
}
