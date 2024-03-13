package unit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class P01_Assert {
	@Test
	public void run() {
		int actual = 10;
		int expected = 10;
//		assertEquals(expected, actual);
//		assertTrue(false);
//		assertFalse(false);
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5,6};
		assertArrayEquals(a, b);
	}
}
