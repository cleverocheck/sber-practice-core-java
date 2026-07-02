package core.practice.sber;

class Triangle extends Figure {
    double side;

    Triangle(Point point, double side) {
        super(point);
        this.side = side;
    }

    @Override
    double area() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    double perimeter() {
        return 3 * side;
    }

    @Override
    public void draw(Color color) {
        System.out.println("Triangle " + point + " " + color);
    }
}