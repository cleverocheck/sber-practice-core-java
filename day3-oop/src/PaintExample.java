public class PaintExample {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(2, 3), 5);
        Rectangle rectangle = new Rectangle(new Point(0, 0), 4, 6);
        Square square = new Square(new Point(1, 1), 5);
        Triangle triangle = new Triangle(new Point(7, 2), 3);

        FigureUtil.draw(circle);
        FigureUtil.draw(rectangle, Color.RED);
        FigureUtil.draw(square, Color.BLUE);
        FigureUtil.draw(triangle, Color.GREEN);

        System.out.println(FigureUtil.area(circle));
        System.out.println(FigureUtil.perimeter(rectangle));
        System.out.println(FigureUtil.area(square));
        System.out.println(FigureUtil.perimeter(triangle));
    }
}

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

interface Drawable {
    void draw(Color color);
}

abstract class Figure implements Drawable {
    protected Point point;

    Figure(Point point) {
        this.point = point;
    }

    abstract double area();

    abstract double perimeter();

    public void draw() {
        draw(Color.BLACK);
    }
}

enum Color {
    RED,
    BLUE,
    GREEN,
    WHITE,
    BLACK
}

class Circle extends Figure {
    double radius;

    Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void draw(Color color) {
        System.out.println("Circle " + point + " " + color);
    }
}

class Rectangle extends Figure {
    double width;
    double height;

    Rectangle(Point point, double width, double height) {
        super(point);
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }

    public void draw(Color color) {
        System.out.println("Rectangle " + point + " " + color);
    }
}

class Square extends Rectangle {
    Square(Point point, double side) {
        super(point, side, side);
    }

    public void draw(Color color) {
        System.out.println("Square " + point + " " + color);
    }
}

class Triangle extends Figure {
    double side;

    Triangle(Point point, double side) {
        super(point);
        this.side = side;
    }

    double area() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    double perimeter() {
        return 3 * side;
    }

    public void draw(Color color) {
        System.out.println("Triangle " + point + " " + color);
    }
}

class FigureUtil {
    private FigureUtil() {
    }

    static double area(Figure f) {
        return f.area();
    }

    static double perimeter(Figure f) {
        return f.perimeter();
    }

    static void draw(Figure f) {
        f.draw();
    }

    static void draw(Figure f, Color color) {
        f.draw(color);
    }
}