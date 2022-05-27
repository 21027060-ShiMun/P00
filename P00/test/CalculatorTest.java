import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	int a, b;
	Calculate cal = new Calculate();

	@Before
	public void setUp() throws Exception {
		a = 4321;
		b = 1234;
		
	}

	@Test
	public void testAdd() {	
		int actual = cal.add(a, b);

		int expected = 5555;
		assertEquals(expected, actual);
	}

	@Test
	public void testSub() {
		int actual = cal.subtract(a, b);
		int expected = 3087;
		assertEquals(expected, actual);
	}

	@Test
	public void testMult() {
		int actual = cal.multiple(a, b);
		int expected = 5332114;
		assertEquals(expected, actual);
	}

	@Test
	public void testDiv() {
		int actual = cal.divide(a, b);
		int expected = 3;
		assertEquals (expected, actual);
		}

	@After
	public void tearDown() throws Exception {
	}
	
	

}
