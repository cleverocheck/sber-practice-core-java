package ru.sbt.study.java.core.reflection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("PetName", Status.AVAILABLE, new ArrayList());
        Animal animal = PetToAnimalConverter.convertToAnimal(pet);
        System.out.println(animal);
    }
}
