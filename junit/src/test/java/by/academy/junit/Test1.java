package by.academy.junit;

import org.junit.Test;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Test1 extends Assert {
	private int valueA;
	private int valueB;
	private int expected;

	public Test1(int valueA, int valueB, int expected) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:divideOf({0}+{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(
				new Object[][] { { 12, 1, 13 }, { 231, 12, 243 }, { 5, 2, 7 }, { 10, 10, 20 }, { 32, 32, 64 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.getSum(valueA, valueB));
	}

}
