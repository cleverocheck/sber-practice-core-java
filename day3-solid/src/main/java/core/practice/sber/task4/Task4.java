package core.practice.sber.task4;

//Было нарушение Interface Segregation
public class Task4 {
    public static void main(String[] args) {
        Eater human = new Human();
        Worker robot = new Robot();

        human.eat();
        robot.work();
    }
}