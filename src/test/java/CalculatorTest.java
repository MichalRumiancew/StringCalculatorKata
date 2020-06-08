import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();

    }

    @Test
    public void shouldReturnZeroWhenGotEmptyString() {
        int result = calculator.add("");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void shouldReturnNumberWhenGivenNumber() {
        int result = calculator.add("1");
        assertThat(result).isEqualTo(1);

    }
    @Test
    void shouldAddTwoNumbersSeparatedWhithComma(){
        int result = calculator.add("1,2");
        assertThat(result).isEqualTo(3);
    }
}
