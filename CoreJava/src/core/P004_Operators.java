package core;
/*
1.Assignment Operator -> =, +=, -=, *=, /=
2.Arithmetic "" -> +, -, *, /, %
3.Conditional "" -> >, >=, <, <=, ==, !=
4.Logical "" -> &&(AND) ,||(OR) , !(NOT)
5.Unary "" -> ++, --   
*/
public class P004_Operators {
	public static void main(String[] args) {
		int i = 24, j = 20, k = 3, l = -4;
		i += k;// i = i*k
		i -= k;// i = i-k
		i *= k;// i = i*k
		i /= k;// i = i/k
		System.out.println("i = " + i);
		// + + = +
		// + - = -
		// - + = -
		// - - = +
		j = -l;
		System.out.println("j = " + j);
		System.out.println(2 != 1);

		i++; // i = i + 1;
		System.out.println("i = " + i);
		int m = 23;
		m--;
		System.out.println("j = " + m);

		int a = 1, b = 2, c, d;
		a = b++;
		System.out.println("a = " + a);
		c = b;
		System.out.println("c = " + c);

	}
}
