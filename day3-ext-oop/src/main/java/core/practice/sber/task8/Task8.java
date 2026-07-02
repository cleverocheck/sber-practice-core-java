package core.practice.sber.task8;

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