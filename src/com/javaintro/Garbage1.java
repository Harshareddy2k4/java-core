package com.javaintro;
public class Garbage1 {
 @Override
protected void finalize() throws Throwable {
	 System.out.println("garbage collected");
}
	public static void main(String[] args) {
	 Garbage1 gar = new Garbage1();
	 System.out.println(gar);
	 Garbage1 gar1 = new Garbage1();
	 System.out.println(gar1);
	 Garbage1 gar2 = new Garbage1();
	 System.out.println(gar2);
	gar1 = null;
	gar2 = null;
	System.gc();
	
	}

}
