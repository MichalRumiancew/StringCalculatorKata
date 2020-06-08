//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class CalculatorTest1
//
//
//    private Calculator calculator;
//
//    @BeforeEach
//    void initCalculator() {
//        calculator = new Calculator();
//    }
//
//    @Test
//    public void shouldReturnZeroWhenEmptyStringGiven() {
//        int result = calculator.add("");
//        assertThat(result).isEqualTo(0);
//    }
//
//    @Test
//    void shouldReturnOneWhenOneGiven() {
//        int result = calculator.add("1");
//        assertThat(result).isEqualTo(1);
//    }
//
//    @Test
//    void shouldReturnTwoWhenTwoGiven() {
//        int result = calculator.add("2");
//        assertThat(result).isEqualTo(2);
//    }
//
//    @Test
//    void shouldReturnSumOfTwoNumbers() {
//        int result = calculator.add("1,2");
//        assertThat(result).isEqualTo(3);
//    }
//
//    @Test
//    void shouldReturnSumOfThreeNumbers() {
//        int result = calculator.add("1,2,3");
//        assertThat(result).isEqualTo(6);
//    }
//}
