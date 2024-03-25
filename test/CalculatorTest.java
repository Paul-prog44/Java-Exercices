import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	@Test
	public void calculatorInitialValueToZero() {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.getValue());
	}
	
	@Test
	public void valueFiveWhenFiveAdded() {
		Calculator calculator = new Calculator();
		calculator.add(5);
		assertEquals(5, calculator.getValue());
	}
	
	@Test
	public void valueMinusTwoWhenTwoSubstracted() {
		Calculator calculator = new Calculator();
		calculator.substract(2);
		assertEquals(-2, calculator.getValue());
		
	}

}
