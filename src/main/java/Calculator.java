public class Calculator {

    public int add(String input) {
        if(input.isEmpty()){
            return 0;
        }
        String[] numbers = input.split("\\,");
        return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
    }
}
