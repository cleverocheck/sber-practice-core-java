package core.practice.sber.task5;

import java.util.ArrayList;

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