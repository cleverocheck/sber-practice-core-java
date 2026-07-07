package core.practice.sber.task3;

import java.io.Serializable;

public class Armor implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int defense;

    public Armor() {
        this.name = "Шлем";
        this.defense = 5;
    }

    public Armor(String name, int defense) {
        this.name = name;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Armor{name='" + name + "', defense=" + defense + "}";
    }
}