package core.practice.sber;

//Проверьте, является ли введённое пользователем с клавиатуры натуральное
//число — простым. Постарайтесь не выполнять лишних действий (например, после
//того, как вы нашли хотя бы один нетривиальный делитель уже ясно, что число
//составное и проверку продолжать не нужно).

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.print("Ни простое, ни составное");
            return;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                System.out.print("Составное");
                return;
            }
        }
        System.out.print("Простое");
    }
}

