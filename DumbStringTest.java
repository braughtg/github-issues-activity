import static org.junit.Assert.*;

import org.junit.Test;


public class DumbStringTest {

	@Test
	public void testAllDigitsTrue() {
		DumbString ds = new DumbString();
		String s = "12345";
		assertTrue(ds.allDigits(s));
	}

	@Test
	public void testAllDigitsFalse() {
		DumbString ds = new DumbString();
		String s = "abcd5";
		assertFalse(ds.allDigits(s));
	}
	
	@Test
	public void testLettersInCommon() {
		String a = "abce";
		String b = "dcba";
		int expected = 3;
		int actual = DumbString.lettersInCommon(a, b);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLettersInCommonDoubleCount() {
		String a = "aa";
		String b = "ba";
		int expected = 1;
		int actual = DumbString.lettersInCommon(a, b);
		assertEquals(expected, actual);
	}
	
}
