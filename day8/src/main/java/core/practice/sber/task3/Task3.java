package core.practice.sber.task3;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, 1500.0, LocalDate.of(2024, 1, 15)),
                new Order(2, 2500.0, LocalDate.of(2024, 1, 20)),
                new Order(3, 800.0, LocalDate.of(2024, 2, 10)),
                new Order(4, 3200.0, LocalDate.of(2024, 1, 25)),
                new Order(5, 450.0, LocalDate.of(2024, 2, 5))
        );

        Order maxOrder = orders.stream()
                .max(Comparator.comparingDouble(Order::getAmount))
                .orElse(null);
        System.out.println("Максимальная сумма: " + maxOrder.getAmount());

        Order minOrder = orders.stream()
                .min(Comparator.comparingDouble(Order::getAmount))
                .orElse(null);
        System.out.println("Минимальная сумма: " + minOrder.getAmount());

        int targetMonth = 1;
        int targetYear = 2024;
        double sumByMonth = orders.stream()
                .filter(o -> o.getDate().getMonthValue() == targetMonth && o.getDate().getYear() == targetYear)
                .mapToDouble(Order::getAmount)
                .sum();
        System.out.println("Сумма за " + targetMonth + " месяц " + targetYear + " года: " + sumByMonth);
    }
}