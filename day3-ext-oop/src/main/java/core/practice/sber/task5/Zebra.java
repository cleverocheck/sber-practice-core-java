package core.practice.sber.task5;

class Zebra extends Animal {
    public Zebra(String name, int age) {
        super(name, age, "zebra");
    }

    @Override
    public void makeSound() {
        System.out.println("неизде");
    }

    @Override
    public String getDietDescription() {
        return "травоядное";
    }
}