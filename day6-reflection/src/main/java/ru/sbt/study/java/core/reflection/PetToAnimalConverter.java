package ru.sbt.study.java.core.reflection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetToAnimalConverter {
    public static Animal convertToAnimal(Pet pet) {
        try {
            Field nameField = Pet.class.getDeclaredField("name");
            Field statusField = Pet.class.getDeclaredField("status");
            Field photosListField = Pet.class.getDeclaredField("photosList");

            nameField.setAccessible(true);
            statusField.setAccessible(true);
            photosListField.setAccessible(true);

            String name = (String) nameField.get(pet);
            Status status = (Status) statusField.get(pet);
            List<Photo> photosList = (List<Photo>) photosListField.get(pet);

            Animal animal = new Animal();

            Field titleField = Animal.class.getDeclaredField("title");
            Field isAvailableField = Animal.class.getDeclaredField("isAvailable");
            Field isSoldField = Animal.class.getDeclaredField("isSold");
            Field photosMapField = Animal.class.getDeclaredField("photosMap");

            titleField.setAccessible(true);
            isAvailableField.setAccessible(true);
            isSoldField.setAccessible(true);
            photosMapField.setAccessible(true);

            titleField.set(animal, name);
            isAvailableField.set(animal, status == Status.AVAILABLE);
            isSoldField.set(animal, status == Status.SOLD);

            Map<String, String> photosMap = new HashMap<>();
            if (photosList != null) {
                for (Photo photo : photosList) photosMap.put(photo.getName(), photo.getURL());
            }
            photosMapField.set(animal, photosMap);

            return animal;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Error converting Pet to Animal", e);
        }
    }
}