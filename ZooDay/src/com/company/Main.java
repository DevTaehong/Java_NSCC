package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal cat = new Animal();

        Animal lion = new Animal("Lion",500,"Jungle",true);
        Animal cow = new Animal("Cow",600,"Farm",false);
        Animal dog = new Animal("Dog",100,"House",false);

        // Step 7: Populate my zoo
        // You can use (Animal[] zoo1 = new Animal[4];) or use Arraylist (Array of objects)
        ArrayList<Animal> zoo = new ArrayList<Animal>(); //Array of object (Dynamic Arrays)

        zoo.add(cat);
        zoo.add(lion);
        zoo.add(cow);
        zoo.add(dog);

        // Step 8: Interacting with the animal objects.

        for (Animal currentAnimal:zoo) {
            System.out.println(currentAnimal.feed("Raw Food"));
            System.out.println(currentAnimal.makeSound());
            System.out.println(currentAnimal.toString());
        }

        System.out.println("\nUsing overriding concept");
        System.out.println(cat);
        System.out.println(lion);






    }
}
