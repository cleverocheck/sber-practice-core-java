package core.practice.sber.task1;

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