package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import alma.Korte;

public class KorteTest {

	@Test
	public void testTest() {
		Korte test = new Korte();
		double expected = 2;
		double actual = test.test(3, 1);
		assertEquals(expected, actual, 1e-4);
		
	}

}
