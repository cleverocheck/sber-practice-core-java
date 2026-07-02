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
    }
}