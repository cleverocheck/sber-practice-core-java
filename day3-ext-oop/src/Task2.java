import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        BattleArena battleArena = new BattleArena();

        Character warrior = new Warrior("Warrior", 100.0, 20.0);
        Character healer = new Healer("Healer", 80.0, 10.0);

        System.out.println("Warrior HP: " + warrior.getHealth());
        System.out.println("Healer HP: " + healer.getHealth());

        battleArena.fight(warrior, healer);

        System.out.println("Warrior alive: " + warrior.isAlive());
        System.out.println("Healer alive: " + healer.isAlive());

        Character warrior2 = new Warrior("Warrior", 100.0, 20.0);
        Character mage = new Mage("Mage", 80.0, 10.0);

        battleArena.fight(warrior2, mage);


        System.out.println(warrior2.getName() + " alive: " + warrior2.isAlive());
        System.out.println(mage.getName() + " alive: " + mage.isAlive());
    }
}

abstract class Character {
    private final String name;
    private double health;
    private final double attackDamage;

    public Character(String name, double health, double attackDamage) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public boolean isAlive() {
        return getHealth() > 0;
    }

    public abstract void attack(Character target);
}

class Warrior extends Character {
    public Warrior(String name, double health, double attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public void attack(Character target) {
        double damage = getAttackDamage();
        if (getHealth() < 50) damage *= 1.2;
        target.setHealth(target.getHealth() - damage);
    }
}

class Mage extends Character {
    public Mage(String name, double health, double attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public void attack(Character target) {
        double factor = 0.7 + Math.random() * 0.6;
        target.setHealth(target.getHealth() - getAttackDamage() * factor);
    }
}

class Healer extends Character {
    public Healer(String name, double health, double attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public void attack(Character target) {
        target.setHealth(target.getHealth() - getAttackDamage() * 0.5);
        setHealth(getHealth() + 10);
    }
}

class BattleArena {
    public void fight(Character a, Character b) {
        while (a.isAlive() && b.isAlive()) {
            a.attack(b);
            if (b.isAlive()) b.attack(a);
        }
    }
}