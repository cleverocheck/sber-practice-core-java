package core.practice.sber;

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

    @Override
    public void draw(Color color) {
        System.out.println("Circle " + point + " " + color);
    }
}