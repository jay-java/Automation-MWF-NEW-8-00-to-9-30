package core;

//to convert data from one datatype to another datatype.
//2 Types
//1.Implicit -> by compiler
//2.Explicit -> by User
public class P003_TypeCasting {
	public static void main(String[] args) {
		byte i = 1;
		System.out.println("i = " + i);
		double d = 1;
		System.out.println("d = " + d);

		int j = (int) 3.14;
		System.out.println(j);

		int a = 10;
		int b = 3;
		double c = (double) a / (double) b;
		System.out.println("c = " + c);

		System.out.println("a = " + a);

	}
}
