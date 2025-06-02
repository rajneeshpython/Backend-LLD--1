package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair pair = new Pair();
        pair.setFirst("Hello");
        pair.setSecond(10);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        // No type safety
        pair.setFirst(10);
        pair.setSecond("Hello");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        // Generic Pair

        GenericPair<String, Integer> genericPair = new GenericPair<>();
        genericPair.setFirst("Hello");
        genericPair.setSecond(10);
        System.out.println(genericPair.getFirst());
        System.out.println(genericPair.getSecond());

        // genericPair.setFirst(10);

        Integer data = GenericPair.doSomething(10, "Pair");
        System.out.println(data);

        System.out.println("---------------");
        Animal animal = new Animal();
        animal.setName("Animal");
        Mammal mammal = new Mammal();
        mammal.setName("Mammal");
        Dog dog = new Dog();
        dog.setName("Dog");
        Cat cat = new Cat();
        cat.setName("Cat");

        List<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(mammal);
        animals.add(dog);
        animals.add(cat);
        AnimalUtility.printAnimal(animals);

//        List<Dog> dogs = new ArrayList<>();
//        dogs.add(dog);
//        AnimalUtility.printAnimal(dogs);

        System.out.println("-----------------");
        AnimalUtility.printAnimalName(animals);
    }
}

