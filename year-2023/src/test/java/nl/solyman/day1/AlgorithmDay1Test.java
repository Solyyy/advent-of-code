package nl.solyman.day1;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlgorithmDay1Test {

    @Test
    void part1_example() {
        File file = new File(getClass().getClassLoader().getResource("day1/example.txt").getPath());
        String input = readFile(file);

        int output = new AlgorithmDay1().part_1(input);

        assertEquals(142, output);

    }

    @Test
    void part1() {
        File file = new File(getClass().getClassLoader().getResource("day1/input.txt").getPath());
        String input = readFile(file);

        int output = new AlgorithmDay1().part_1(input);

        assertEquals(55834, output);

    }
    @Test
    void part2_example() {
        File file = new File(getClass().getClassLoader().getResource("day1/example2.txt").getPath());
        String input = readFile(file);

        int output = new AlgorithmDay1().part_2(input);

        assertEquals(0, output);

    }

    public String readFile(File file) {
        try {
            return Files.readString(file.toPath(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}