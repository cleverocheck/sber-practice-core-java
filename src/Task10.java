//Напишите программу, принимающую на вход натуральное число в десятичной
//системе счисления (не более 100) и выводит его же, но в римской записи.

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int number = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                result.append(symbols[i]);
                number -= values[i];
            }
        }

        System.out.print(result);
    }
}

