package core.practice.sber.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(2, 3));
        shapes.add(new Triangle(3, 4, 5));

        for (Shape s : shapes) {
            s.describe();
        }
    }
}