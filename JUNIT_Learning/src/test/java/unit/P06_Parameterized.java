package unit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class P06_Parameterized {
	int a, b, eResult;

	public P06_Parameterized(int a, int b, int result) {
		super();
		this.a = a;
		this.b = b;
		this.eResult = result;
	}

	@Test
	public void addTest() {
		Calc c = new Calc();
		int actual = c.add(a, b);
		assertEquals(eResult, actual);
	}

	@Parameters
	public static List<Object[]> getData() {
		Object o[][] = new Object[4][3];
		o[0][0] = 1;
		o[0][1] = 2;
		o[0][2] = 3;
		
		o[1][0] = 10;
		o[1][1] = 20;
		o[1][2] = 30;
		
		o[2][0] = 12;
		o[2][1] = 22;
		o[2][2] = 34;
		
		o[3][0] = 10;
		o[3][1] = 20;
		o[3][2] = 300;
		
		return Arrays.asList(o);
	}

}
