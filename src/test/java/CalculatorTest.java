import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.asserts.Assertion;

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
    void shouldAddTwoNumbersSeparatedWithComma() {
        int result = calculator.add("1,2");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void shouldAddThreeNumbersSeparatedWithComma() {
        int result = calculator.add("1,2,3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    void shouldAddThreeNumbersSeparatedWithCommaAndNewLine() {
        int result = calculator.add("1,2\n4");
        assertThat(result).isEqualTo(7);

    }

    @Test
    void shouldThrowExceptionWhenNegativeNumberProvided() {
        Assertion.assertThrows
    }


}
