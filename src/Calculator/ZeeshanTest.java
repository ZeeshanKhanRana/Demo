package Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZeeshanTest {

	@Test
	public void test() {
		Calculator cl=new Calculator();
		int a=cl.function1();
		assertEquals(1, a);
	}

}
