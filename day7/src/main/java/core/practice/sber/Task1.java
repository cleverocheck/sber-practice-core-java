package core.practice.sber;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("day7/src/main/resources/Borodino.txt");
        Path outputPath = Paths.get("day7/src/main/resources/Borodino_fixed.txt");

        try (Stream<String> lines = Files.lines(inputPath);
             BufferedWriter writer = Files.newBufferedWriter(outputPath)) {

            Iterator<String> it = lines.iterator();
            while (it.hasNext()) {
                String fixedLine = it.next().trim().replaceAll("\\s+", " ");
                writer.write(fixedLine);
                writer.newLine();
            }
        }
    }
}
