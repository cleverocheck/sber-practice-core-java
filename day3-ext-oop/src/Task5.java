import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimal(new Lion("Leo", 5));
        zoo.addAnimal(new Zebra("Marty", 4));
        zoo.addAnimal(new Penguin("Pingu", 2));

        zoo.makeAllSounds();
        zoo.feedAll();

        for (Swimmable s : zoo.getSwimmableAnimals()) {
            s.swim();
        }
    }
}

interface Swimmable {
    void swim();
}

abstract class Animal {
    private final String name;
    private int age;
    private final String species;

    public Animal(String name, int age, String species) {
        setAge(age);
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public void setAge(int age) {
        if (age <= 0) throw new IllegalArgumentException();
        this.age = age;
    }

    public abstract void makeSound();

    public abstract String getDietDescription();
}

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age, "lion");
    }

    @Override
    public void makeSound() {
        System.out.println("роар");
    }

    @Override
    public String getDietDescription() {
        return "хищник";
    }
}

class Zebra extends Animal {
    public Zebra(String name, int age) {
        super(name, age, "zebra");
    }

    @Override
    public void makeSound() {
        System.out.println("неизде");
    }

    @Override
    public String getDietDescription() {
        return "травоядное";
    }
}

class Penguin extends Animal implements Swimmable {
    public Penguin(String name, int age) {
        super(name, age, "penguin");
    }

    @Override
    public void makeSound() {
        System.out.println("квак");
    }

    @Override
    public String getDietDescription() {
        return "травоядное";
    }

    @Override
    public void swim() {
        System.out.println("swimming");
    }
}

class Zoo {
    private final ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void makeAllSounds() {
        for (Animal a : animals) {
            a.makeSound();
        }
    }

    public void feedAll() {
        for (Animal a : animals) {
            System.out.println(a.getName() + ": " + a.getDietDescription());
        }
    }

    public ArrayList<Swimmable> getSwimmableAnimals() {
        ArrayList<Swimmable> list = new ArrayList<>();
        for (Animal a : animals) {
            if (a instanceof Swimmable) list.add((Swimmable) a);
        }
        return list;
    }
}