package core.practice.sber.task3;

class RectangleLSP implements Shape {
    private int width;
    private int height;

    RectangleLSP(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}