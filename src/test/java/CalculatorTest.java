import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator("Scientific calculator", "Pink", 10, true);
    }

    //calculatorHasName, hasPrice, hasColour

    @Test
    public void hasPrice(){
        assertThat(calculator.getPrice()).isEqualTo(10);
    }

    @Test
    public void testingScientificCalculator(){
        assertThat(calculator.addBattery()).isEqualTo("No battery needed");
    }

    @Test
    public void testingCalculatorThatNeedsBattery(){
        calculator.setSolar(false);
        assertThat(calculator.isSolar()).isEqualTo(false);
        assertThat(calculator.addBattery()).isEqualTo("Battery added");
    }
}
