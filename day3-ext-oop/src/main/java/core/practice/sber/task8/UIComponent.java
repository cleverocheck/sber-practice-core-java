package core.practice.sber.task8;

abstract class UIComponent {
    private boolean visible = true;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public abstract void render();

    public abstract int getWidth();

    public abstract int getHeight();
}