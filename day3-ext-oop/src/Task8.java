import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Container root = new Container();

        root.add(new Button());
        root.add(new Label());

        Container child = new Container();
        child.add(new TextBox());
        child.add(new CheckBox());

        root.add(child);

        root.render();

        System.out.println("Root width: " + root.getWidth());
        System.out.println("Root height: " + root.getHeight());
    }
}

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

class Label extends UIComponent {
    @Override
    public void render() {
        System.out.println("Label");
    }

    @Override
    public int getWidth() {
        return 8;
    }

    @Override
    public int getHeight() {
        return 1;
    }
}

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
        return 3;
    }
}

class CheckBox extends UIComponent {
    @Override
    public void render() {
        System.out.println("CheckBox");
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