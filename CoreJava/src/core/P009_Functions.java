package core;

//1.Without return type without parameter/argument
//2.Without return type with parameter
//3.With return type without parameter
//4.With return type with parameter
class AB {
	public void call() {
		System.out.println("hello call function");
	}

	public void call1(double i) {
		System.out.println("hello call function : " + i);
	}

	public double call2() {
		System.out.println("hello call function");
		return 1234;
	}

	public int square(int num) {
		System.out.println("hello call function");
		return num * num;
	}

}

public class P009_Functions {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("hello user");
		System.out.println("user 2");
		AB a = new AB();
		a.call();
		a.call1(123.12);
		double res = a.call2();
		System.out.println(res);

		int sq = a.square(4);
		System.out.println(sq);
	}
}
