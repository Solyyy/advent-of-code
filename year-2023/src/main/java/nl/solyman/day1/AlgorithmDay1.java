package nl.solyman.day1;

import java.util.HashMap;

public class AlgorithmDay1 {

    public int part_1(String input) {

        String[] lines = input.split("\\r?\\n");
        int total = 0;

        char firstDigit = 0;
        char lastDigit = 0;
        boolean firstDigitFound = false;

        for (String line : lines) {

            for (int j = 0; j < line.length(); j++) {
                char currentChar = line.charAt(j);

                if (Character.isDigit(currentChar)) {
                    if (!firstDigitFound) {
                        firstDigit = currentChar;
                        firstDigitFound = true;
                    }
                    lastDigit = currentChar;
                }

            }
            int totalValue = Integer.parseInt("" + firstDigit + lastDigit);
            total += totalValue;
            firstDigitFound = false;
        }
        return total;
    }

    public int part_2(String input) {
        HashMap<String, Integer> numberHashMap = new HashMap<String, Integer>();

        numberHashMap.put("one", 1);
        numberHashMap.put("two", 2);
        numberHashMap.put("three", 3);
        numberHashMap.put("four", 4);
        numberHashMap.put("five", 5);
        numberHashMap.put("six", 6);
        numberHashMap.put("seven", 7);
        numberHashMap.put("eight", 8);
        numberHashMap.put("nine", 9);

        String[] lines = input.split("\\r?\\n");

        int total = 0;
        boolean firstStrFound = false;
        String currentString = "";
        String newString = "";

        for (String line : lines) {

            for (int j = 0; j < line.length(); j++) {
                char currentChar = line.charAt(j);
                currentString += currentChar;

                if (numberHashMap.containsKey(currentString.toString()) || Character.isDigit(currentChar)) {
                    if (numberHashMap.containsKey(currentString)) {
                        System.out.println("found");
                        newString += numberHashMap.get(currentString);
                        currentString = "";

                        System.out.println(newString);
                        firstStrFound = true;
                    }
                }
                else {
                    currentString = "";
                }
            }
//            int totalValue = Integer.parseInt("" + firstDigit + lastDigit);
//            total += totalValue;
        }


        return 0;
    }
}