package core.practice.sber.task2;

class CircleShape implements Shape {
    double radius;

    CircleShape(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}