package core.practice.sber;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "Один");
        System.out.println("Создан pair1: " + pair1);
        System.out.println("getKey(): " + pair1.getKey());
        System.out.println("getValue(): " + pair1.getValue());

        Pair<String, Double> pair2 = new Pair<>("PI", 3.14159);
        System.out.println("Создан pair2: " + pair2);

        pair1.setKey(10);
        pair1.setValue("Десять");
        System.out.println("После изменения pair1: " + pair1);

        Pair<String, Date> pair3 = new Pair<>("Текущая дата", new Date());
        System.out.println("Создан pair3: " + pair3);
    }
}