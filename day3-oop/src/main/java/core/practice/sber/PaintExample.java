package core.practice.sber;

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
