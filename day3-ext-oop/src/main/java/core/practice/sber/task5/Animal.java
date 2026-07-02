package core.practice.sber.task5;

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