package Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator cit = new Calculator();
		int a =cit.function1();
		assertEquals(1, a);
	}

}
