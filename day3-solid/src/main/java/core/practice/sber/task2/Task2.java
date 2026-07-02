package core.practice.sber.task2;

//Было нарушение Open/Closed
public class Task2 {
    public static void main(String[] args) {
        CircleShape circle = new CircleShape(10);
        System.out.println(circle.calculateArea());

        RectangleShape rectangle = new RectangleShape(100, 200);
        System.out.println(rectangle.calculateArea());

        Triangle triangle = new Triangle(50, 70);
        System.out.println(triangle.calculateArea());
    }
}