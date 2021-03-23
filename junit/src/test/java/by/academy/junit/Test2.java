package by.academy.junit;

import org.junit.Assert;
import org.junit.Test;

public class Test2 extends Assert {

	@Test
	public void testPow() {
		assertTrue(Math.pow(2, 2) == 4);
	}
}
