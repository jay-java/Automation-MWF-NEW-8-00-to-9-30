package core;

public class P002_DataTypes {
	public static void main(String[] args) {
		System.out.print("hello");
		System.out.println("hello java");
		System.out.println("hello again");
		System.out.println(1+2);
		byte b = 12;
		System.out.println(b);
		short s = 12;
		int i = 12;
		long l = 12+12;
		System.out.println(l);
		float f = 3.144564577765776f;//4
		System.out.println(f);
		double d = 3.144786788456;//8
		System.out.println(d);
		boolean bool = true;
		char c = 'a';
		System.out.println(c);
		int a1 =12;
		int b1 = 7;
		int c1  =a1/b1;
		System.out.println(c1);
		int base = 10;
		int height = 5;
		int areaOfTriangle = (base*height)/2;
		System.out.println("area of triangle : "+areaOfTriangle);
		int r = 12;
		System.out.println("area of circle : "+(Math.PI*r*r));
		System.out.println(11%5);
	}
}
