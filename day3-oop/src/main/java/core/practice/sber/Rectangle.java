package core.practice.sber;

class Rectangle extends Figure {
    double width;
    double height;

    Rectangle(Point point, double width, double height) {
        super(point);
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public void draw(Color color) {
        System.out.println("Rectangle " + point + " " + color);
    }
}