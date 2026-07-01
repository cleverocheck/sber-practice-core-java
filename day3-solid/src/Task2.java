public class Task2 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.calculateArea());

        Rectangle rectangle = new Rectangle(100, 200);
        System.out.println(rectangle.calculateArea());

        Triangle triangle = new Triangle(50, 70);
        System.out.println(triangle.calculateArea());
    }
}

//Было нарушение Open/Closed

interface Shape2 {
    double calculateArea();
}

class Circle implements Shape2 {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape2 {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}

class Triangle implements Shape2 {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}