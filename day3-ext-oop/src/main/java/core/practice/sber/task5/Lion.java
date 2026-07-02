package core.practice.sber.task5;

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age, "lion");
    }

    @Override
    public void makeSound() {
        System.out.println("роар");
    }

    @Override
    public String getDietDescription() {
        return "хищник";
    }
}