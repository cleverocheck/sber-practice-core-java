package core.practice.sber.task8;

class TextBox extends UIComponent {
    @Override
    public void render() {
        System.out.println("TextBox");
    }

    @Override
    public int getWidth() {
        return 20;
    }

    @Override
    public int getHeight() {
        return 2;
    }
}