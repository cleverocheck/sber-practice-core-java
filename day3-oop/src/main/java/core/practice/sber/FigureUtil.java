package core.practice.sber;

class FigureUtil {
    private FigureUtil() {
    }

    static double area(Figure f) {
        return f.area();
    }

    static double perimeter(Figure f) {
        return f.perimeter();
    }

    static void draw(Figure f) {
        f.draw();
    }

    static void draw(Figure f, Color color) {
        f.draw(color);
    }
}