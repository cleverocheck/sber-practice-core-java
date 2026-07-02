package core.practice.sber.task3;

class SquareLSP implements Shape {
    private int size;

    SquareLSP(int size) {
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getArea() {
        return size * size;
    }
}