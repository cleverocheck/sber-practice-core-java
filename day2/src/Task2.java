public class Task2 {
    public static void main(String[] args) {
        Circle circle = new Circle(10, "red");

        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println(circle);
    }
}

class Circle {
    private final double radius;
    private final String color;

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return radius + " " + color + " " + area() + " " + perimeter();
    }
}