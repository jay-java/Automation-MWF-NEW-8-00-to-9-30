package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P02_CalcTest {
	@Test
	public void addTest() {
		Calc c = new Calc();
		int a = 12;
		int b = 20;
		int actual= c.add(a, b);
		int expected = 40;
		assertEquals(expected, actual);
	}
}
