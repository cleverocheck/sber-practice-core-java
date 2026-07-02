package core.practice.sber.task5;

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