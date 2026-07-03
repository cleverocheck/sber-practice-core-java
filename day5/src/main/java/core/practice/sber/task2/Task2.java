package core.practice.sber.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static Map<String, Integer> countWords(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(filePath));

        Map<String, Integer> wordCount = new HashMap<>();

        for (String line : lines) {
            String[] words = line.split("\\s+");

            for (String word : words)
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String filePath = "day5/src/main/resources/sample.txt";

        try {
            Map<String, Integer> result = countWords(filePath);

            for (Map.Entry<String, Integer> entry : result.entrySet())
                System.out.println(entry.getKey() + " : " + entry.getValue());
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}