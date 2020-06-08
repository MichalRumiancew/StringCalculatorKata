public class Calculator1 {
    public int add(String numbers) {
        if ("".equals(numbers))
            return 0;
        else {
            int result = 0;
            for (String number : numbers.split(",")) {
                result += getIntFrom(number);
            }
            return result;
        }
    }

    private int getIntFrom(String individualNumber) {
        return Integer.parseInt(individualNumber);
    }
}
