package core.practice.sber.task3;

import java.io.Serializable;

public class Weapon implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int damage;

    public Weapon() {
        this.name = "Меч";
        this.damage = 10;
    }

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Weapon{name='" + name + "', damage=" + damage + "}";
    }
}