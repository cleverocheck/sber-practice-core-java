package core.practice.sber.task5;

class Penguin extends Animal implements Swimmable {
    public Penguin(String name, int age) {
        super(name, age, "penguin");
    }

    @Override
    public void makeSound() {
        System.out.println("квак");
    }

    @Override
    public String getDietDescription() {
        return "травоядное";
    }

    @Override
    public void swim() {
        System.out.println("swimming");
    }
}