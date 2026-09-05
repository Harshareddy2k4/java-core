package oops;

public class Varargs {
	 static void diplay(Object...numbers) {
		for(int i =0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}
	public static void main(String[] args) {
		Varargs.diplay(10,"HARSHA",23.4,484);

	}

}
