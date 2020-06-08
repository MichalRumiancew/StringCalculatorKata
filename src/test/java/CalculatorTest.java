import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

public class CalculatorTest {


    @Test
    public void shouldReturnZeroWhenGotEmptyString() {
        Calculator calculator = new Calculator();
        int result = calculator.add("");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void shoulgReturnNumberWhenGivenNumber() {
        Calculator calculator = new Calculator();
        int result = calculator.add("1");
        assertThat(result).isEqualTo(1);

    }
}
