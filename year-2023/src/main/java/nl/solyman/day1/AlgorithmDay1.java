package nl.solyman.day1;

public class AlgorithmDay1 {

    public int execute(String input) {

        int total = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isDigit(currentChar)) {

                int digit = Character.getNumericValue(currentChar);


                System.out.println(digit);

            }
        }
        return total;
    }
}