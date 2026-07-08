package core.practice.sber.task2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Иван", 20, "Математика"),
                new Student("Мария", 22, "Физика"),
                new Student("Петр", 19, "Математика"),
                new Student("Анна", 21, "Физика"),
                new Student("Сергей", 23, "Математика")
        );

        Map<String, Double> averageAgeByCourse = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getCourse,
                        Collectors.averagingInt(Student::getAge)
                ));
        averageAgeByCourse.forEach((course, avgAge) -> System.out.println(course + ": " + avgAge));
    }
}
