package core.practice.sber.task2;
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