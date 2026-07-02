package core.practice.sber.task8;

import java.util.ArrayList;

class Container extends UIComponent {
    private final ArrayList<UIComponent> children = new ArrayList<>();

    public void add(UIComponent component) {
        children.add(component);
    }

    public void remove(UIComponent component) {
        children.remove(component);
    }

    @Override
    public void render() {
        for (UIComponent c : children) {
            if (c.isVisible()) c.render();
        }
    }

    @Override
    public int getWidth() {
        int max = 0;
        for (UIComponent c : children) {
            max = Math.max(max, c.getWidth());
        }
        return max;
    }

    @Override
    public int getHeight() {
        int max = 0;
        for (UIComponent c : children) {
            max = Math.max(max, c.getHeight());
        }
        return max;
    }
}