public class Task1 {
    public static void main(String[] args) {
        Phone phone = new Phone(79506612714L, "iPhone", 300);
        Phone defaultWeightPhone = new Phone(79506612714L, "iPhone");
        Phone defaultPhone = new Phone();
        long[] numbers = {79506612711L, 79506612712L, 79506612713L};

        System.out.println(phone.getNumber());
        phone.receiveCall("Игнат");
        phone.sendMessage(numbers);
        System.out.println(phone.toString());
        System.out.println(defaultWeightPhone);
        System.out.println(defaultPhone);
    }
}

class Phone {
    private long number;
    private String model;
    private int weight;

    public long getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    Phone(long number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(long number, String model) {
        this(number, model, 0);
    }

    Phone() {
    }

    public void receiveCall(String name, long number) {
    }

    public void sendMessage(long[] numbers) {
        for (long number : numbers) System.out.println(number);
    }

    @Override
    public String toString() {
        return number + " " + model + " " + weight;
    }
}