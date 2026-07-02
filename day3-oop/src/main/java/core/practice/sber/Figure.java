package core.practice.sber;

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