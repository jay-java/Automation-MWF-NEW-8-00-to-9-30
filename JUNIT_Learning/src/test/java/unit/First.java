package unit;

import org.junit.Ignore;
import org.junit.Test;

public class First {
	@Test
	public void first() {
		System.out.println("first method");
	}
	@Test
//	@Ignore
	public void second() {
		System.out.println("second method");
	}
	@Test
	public void third() {
		System.out.println("third test");
	}
}
