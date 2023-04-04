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
    public void canAddBattery(){
        assertThat(calculator.addBattery()).isEqualTo("No battery needed");
    }
}
