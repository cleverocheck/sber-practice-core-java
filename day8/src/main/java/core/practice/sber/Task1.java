package core.practice.sber;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> strings = List.of("java", "javascript", "python", "java8");
        strings.stream()
                .filter(s -> s.contains("java"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
