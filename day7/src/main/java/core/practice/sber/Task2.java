package core.practice.sber;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("day7/src/main/resources/listNames.txt");
        Path outputPath = Paths.get("day7/src/main/resources/sortedNames.txt");
        String content = Files.readString(inputPath);
        List<String> names = Arrays.stream(content.split(", "))
                .sorted()
                .toList();

        Files.write(outputPath, names);
    }
}
