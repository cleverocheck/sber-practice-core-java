package core.practice.sber.task3;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path filePath = Paths.get("day7/src/main/resources/hero.dat");

        Hero hero = new Hero();
        System.out.println(hero);

        hero.setName("Игнат");
        hero.setLvl(19);
        hero.setWeapon(new Weapon("Меч огня", 99));
        hero.setArmor(new Armor("Доспех света", 75));
        System.out.println(hero);

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filePath.toFile()))) {
            oos.writeObject(hero);
        }

        Hero loadedHero;
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filePath.toFile()))) {
            loadedHero = (Hero) ois.readObject();
        }
        System.out.println(loadedHero);
    }
}