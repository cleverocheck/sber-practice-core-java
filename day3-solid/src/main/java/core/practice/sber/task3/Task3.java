package core.practice.sber.task3;

//Было нарушение Liskov Substitution Principle
public class Task3 {
    public static void main(String[] args) {
        RectangleLSP rectangleLSP = new RectangleLSP(10, 10);
        SquareLSP squareLSP = new SquareLSP(100);
        Shape[] shapes = {rectangleLSP, squareLSP};

        for (Shape shape : shapes) System.out.println(shape.getArea());

        rectangleLSP.setWidth(200);
        rectangleLSP.setHeight(200);
        squareLSP.setSize(1000);

        for (Shape shape : shapes) System.out.println(shape.getArea());
    }
}