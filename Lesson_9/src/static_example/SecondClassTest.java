package static_example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecondClassTest {

	@Test
	void testDigitCount() {
		int res = SecondClass.digitCount("6");
		assertEquals(1,res);
		res = SecondClass.digitCount("test");
		assertEquals(0,res);
		res = SecondClass.digitCount("   ");
		assertEquals(0,res);
		res = SecondClass.digitCount("");
		assertEquals(0,res);
		res = SecondClass.digitCount(null);
		assertEquals(0,res);
	}

}
