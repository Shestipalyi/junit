package by.academy.junit;
import org.junit.Test;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SumTestCalc extends Assert {
	private int valueA;
	private int valueB;
	private int expected;

	public SumTestCalc(int valueA, int valueB, int expected) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:divideOf({0}+{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(
				new Object[][] { { 1, 1, 2 }, { 3, 5, 8 }, { 4, 2, 6 }, { 10, 0, 10 }, { 8, 2, 10 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.getSum(valueA, valueB));
	}

}
