package core.practice.sber.task2;

class RectangleShape implements Shape {
    double width;
    double height;

    RectangleShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}