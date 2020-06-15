public class Calculator {

    public int add(String input) {
        if(input.isEmpty()){
            return 0;
        }

        String[] numbers = input.split(",|\n");
        int result = 0;
        for (String number:numbers) {
            result +=Integer.parseInt(number);
            
        }
        return result;
    }

    private boolean isSingleNumber(String input) {
        return input.matches("[0-9]");
    }
}
