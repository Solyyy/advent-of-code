package nl.solyman.day1;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmDay4Test {

    @Test
    void part1_example() {
        File file = new File(getClass().getClassLoader().getResource("day4/example.txt").getPath());
        String input = readFile(file);

        int output = new AlgorithmDay4().part_1(input);

        assertEquals(13, output);

    }

    @Test
    void part1() {
        File file = new File(getClass().getClassLoader().getResource("day4/input.txt").getPath());
        String input = readFile(file);

        int output = new AlgorithmDay4().part_1(input);

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