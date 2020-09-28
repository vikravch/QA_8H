import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testCheckIsNumber1() {
		String str = "-76.45";
		boolean expected = true;
		
		boolean isStrNumber = Main.checkIsNumber(str);
		
		if(isStrNumber==expected) {
			System.out.println("Success!");
		} else {
			System.out.println("Error.");
			fail("Error");
		}
	}
	
	@Test
	void testCheckIsNumber2() {
		String str = "rwerwerew";
		boolean expected = false;
		
		boolean isStrNumber = Main.checkIsNumber(str);
		
		assertEquals(expected,isStrNumber);
	}

	@Test
	void testIsPrimeTest1() {
		int value = 31;
		boolean expected = true;
		
		boolean res = Main.testIsPrime(value);
		
		assertEquals(expected,res);
	}
	
	@Test
	void testIsPrimeTest2() {
		int value = 24;
		boolean expected = false;
		
		boolean res = Main.testIsPrime(value);
		
		assertEquals(expected,res);
	}
	
	@Test
	void testIsPrimeTest3() {
		int value = 3;
		boolean expected = true;
		
		boolean res = Main.testIsPrime(value);
		
		assertEquals(expected,res);
	}
	
	@Test
	void testIsPrimeTest4() {
		int value = 122;
		boolean expected = false;
		
		boolean res = Main.testIsPrime(value);
		
		assertEquals(expected,res);
	}
	
	@Test
	void testIsPrimeTest5() {
		int value = -5;
		boolean expected = false;
		
		boolean res = Main.testIsPrime(value);
		
		assertEquals(expected,res);
	}
	
	@Test
	void testIsPrimeTest6() {
		int value = 0;
		boolean expected = false;
		
		boolean res = Main.testIsPrime(value);
		
		assertEquals(expected,res);
	}
}
// Test drive development (TDD):
// 1) пишем спецификации для всех функций
// 2) создаем тесты JUnit
// 3) пишем код, пытаемся пройти все тесты
// 4) усовершенствование кода, проверка тестами












