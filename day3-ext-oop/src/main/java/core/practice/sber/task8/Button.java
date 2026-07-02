package core.practice.sber.task8;

class Button extends UIComponent {
    @Override
    public void render() {
        System.out.println("Button");
    }

    @Override
    public int getWidth() {
        return 10;
    }

    @Override
    public int getHeight() {
        return 2;
    }
}