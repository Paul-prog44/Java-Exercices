import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	public void calculatorInitialValueToZero() {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.getValue());
	}

}
