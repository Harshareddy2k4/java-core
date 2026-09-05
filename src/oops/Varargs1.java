package oops;

public class Varargs1 {
	void display(int... a) {
		System.out.println(" TOTAL LENGTH :" + a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		Varargs1 v = new Varargs1();
		v.display(10, 20, 30);
	}

}
