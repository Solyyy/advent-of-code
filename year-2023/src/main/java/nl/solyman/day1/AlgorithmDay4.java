package nl.solyman.day1;

import java.util.List;

public class AlgorithmDay4 {

    public int part_1(String input) {

        String[] lines = input.split("\\r?\\n");

        int totalScore = 0;

        for (String line : lines) {
            String[] parts = line.substring(line.indexOf(":") + 1).split("\\|");
            List<String> winningNumbers = parseNumbers(parts[0].trim());
            List<String> userNumbers = parseNumbers(parts[1].trim());

            int score = calculateScore(winningNumbers, userNumbers);

            totalScore += score;
        }

        return totalScore;

    }

    private List<String> parseNumbers(String numbers) {
        String[] numberArray = numbers.split("\\s+");
        return List.of(numberArray);
    }

    private int calculateScore(List<String> winningNumbers, List<String> userNumbers) {
        int matches = 0;

        for (String userNumber : userNumbers) {
            if (winningNumbers.contains(userNumber)) {
                matches++;
            }
        }
        return (matches > 0) ? (int) Math.pow(2, matches - 1) : 0;

    }

}
