package core.practice.sber.task1;

public class Task1 {
    public static void main(String[] args) {
        Phone phone = new Phone(79506612714L, "iPhone", 300);
        Phone defaultWeightPhone = new Phone(79506612714L, "iPhone");
        Phone defaultPhone = new Phone();
        long[] numbers = {79506612711L, 79506612712L, 79506612713L};

        System.out.println(phone.getNumber());
        phone.receiveCall("Игнат");
        phone.sendMessage(numbers);
        System.out.println(phone);
        System.out.println(defaultWeightPhone);
        System.out.println(defaultPhone);
    }
}