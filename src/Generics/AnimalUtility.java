package Generics;

import java.util.List;

public class AnimalUtility {

    public static <T extends Animal> void printAnimal(List<T> animals){
        for(T animal: animals){
            System.out.println(animal.getName());
        }
    }

    public  static void printAnimalName(List<? extends Animal> animals){
        for(Animal animal: animals){
            System.out.println(animal.getName());
        }
    }
}
