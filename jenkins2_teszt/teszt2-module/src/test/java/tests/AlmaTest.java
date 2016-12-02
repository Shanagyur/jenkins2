package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import alma.Alma;

public class AlmaTest {

	@Test
	public void testTest() {
		Alma test = new Alma();
		double expected = 2;
		double actual = test.test(1, 1);
		assertEquals(expected, actual, 1e-4);
		
	}

}
