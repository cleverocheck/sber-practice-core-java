package core.practice.sber.task8;

class CheckBox extends UIComponent {
    @Override
    public void render() {
        System.out.println("CheckBox");
    }

    @Override
    public int getWidth() {
        return 3;
    }

    @Override
    public int getHeight() {
        return 2;
    }
}