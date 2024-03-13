package unit;

import org.junit.Test;

public class P04_Exception {
	@Test(expected = ArithmeticException.class)
	public void divide() {
		int i = 0;
		int j = 10 / i;
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void arr() {
		int a[] = new int[5];
		a[6] = 10;
	}
}
