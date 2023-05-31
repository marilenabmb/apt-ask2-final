package gr.upatras.junit.second;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	@Test
	 void testExceptionIsThrown() {
	 Calculator tester = new Calculator();
	 assertThrows(IllegalArgumentException.class, () ->
	 tester.subtract(1000, 500));
	 }

	@Test
	void testSubtract() {
		
		Calculator tester = new Calculator();
		 assertEquals(30, tester.subtract(40, 10), "40 - 10 must be 30");
		
	}

}

