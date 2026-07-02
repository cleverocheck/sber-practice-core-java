package core.practice.sber.task8;

class Label extends UIComponent {
    @Override
    public void render() {
        System.out.println("Label");
    }

    @Override
    public int getWidth() {
        return 5;
    }

    @Override
    public int getHeight() {
        return 1;
    }
}