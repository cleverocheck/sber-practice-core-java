package core.practice.sber;

//Сила тяжести на Луне составляет примерно 17% от силы тяжести на Земле.
//Напишите программу, которая вычисляет и выводит в консоль вес на Луне,
//основываясь на введенном пользователем в консоль весе на планете Земля.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double weightRatio = 0.17;

        System.out.print(weight * weightRatio);
    }
}

