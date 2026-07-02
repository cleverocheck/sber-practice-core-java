package core.practice.sber.task3;

abstract class Shape {
    public abstract double area();

    public abstract double perimeter();

    public void describe() {
        System.out.println(
                getClass().getSimpleName() +
                        " | area=" + area() +
                        " | perimeter=" + perimeter() +
                        " | extra info=" + this
        );
    }
}
