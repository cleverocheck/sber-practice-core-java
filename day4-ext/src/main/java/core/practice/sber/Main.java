package core.practice.sber;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Список после добавления: " + list);

        list.add(1, 10);
        System.out.println("После add(1, 10): " + list);

        System.out.println("Элемент по индексу 2: " + list.get(2));

        list.remove(0);
        System.out.println("После удаления элемента 0: " + list);

        System.out.println("Размер списка: " + list.size());

        LinkedList<Integer> limitedList = new LinkedList<>(3);
        limitedList.add(1);
        limitedList.add(2);
        limitedList.add(3);
        System.out.println("Список с max размером 3: " + limitedList);

        try {
            limitedList.add(4);
            System.out.println("  Элемент добавлен");
        } catch (MaxSizeExceededException e) {
            System.out.println(e);
        }

        try {
            list.get(100);
        } catch (ElementNotFoundException e) {
            System.out.println(e);
        }

        try {
            list.remove(-1);
        } catch (ElementNotFoundException e) {
            System.out.println(e);
        }

        try {
            list.add(100, 999);
        } catch (InvalidIndexException e) {
            System.out.println(e);
        }
    }
}