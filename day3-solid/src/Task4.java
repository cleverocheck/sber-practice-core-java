public class Task4 {
    public static void main(String[] args) {
        Eater human = new Human();
        Worker robot = new Robot();

        human.eat();
        robot.work();
    }
}

//Было нарушение Interface Segregation

interface Worker {
    void work();
}

interface Eater {
    void eat();
}

class Human implements Worker, Eater {
    @Override
    public void work() {
        System.out.println("Человек работает");
    }

    @Override
    public void eat() {
        System.out.println("Человек ест");
    }
}

class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Робот работает");
    }
}