package core.practice.sber;

class Square extends Rectangle {
    Square(Point point, double side) {
        super(point, side, side);
    }

    @Override
    public void draw(Color color) {
        System.out.println("Square " + point + " " + color);
    }
}