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

//Было нарушение Liskov Substitution Principle

interface Shape {
    int getArea();
}

class RectangleLSP implements Shape {
    protected int width;
    protected int height;

    public RectangleLSP(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class SquareLSP implements Shape {
    private int size;

    public SquareLSP(int size) {
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getArea() {
        return size * size;
    }
}