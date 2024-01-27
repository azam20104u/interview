package com.azam.unite_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
	public void testAdd4() {
		assertEquals(4, App.main(2, 2));
	}
	@Test
	public void testAdd10() {
		assertEquals(10, App.main(3, 7));
	}
	@Test
	public void testAdd8() {
		assertEquals(8, App.main(4, 4));
	}
	
	@Test
	public void negativeShouldReturnIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> App.main(-1,2));
	}
	
//	/**
//	 * Create the test case
//	 *
//	 * @param testName name of the test case
//	 */
//	public AppTest(String testName) {
//		super(testName);
//	}
//
//	/**
//	 * @return the suite of tests being tested
//	 */
//	public static Test suite() {
//		return new TestSuite(AppTest.class);
//	}
//
//	/**
//	 * Rigourous Test :-)
//	 */
//	public void testApp() {
//		assertTrue(true);
//	}
	
}
