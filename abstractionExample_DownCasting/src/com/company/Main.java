package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Animal> myFarm = new ArrayList<Animal>();

        Cat myNewCat = new Cat("Cat",10,"Home",false,7);
        System.out.println(myNewCat.toString());
        System.out.println(myNewCat.makeSound());
        System.out.println(myNewCat.feed("Mouse"));


        Cow myNewCow = new Cow ("Cow",700,"Farm",false,600);
        // Up Casting :
        Animal mySecondCat = new Cat("Cat",12,"Back yard",false,10);
        Animal mySecondCow = new Cow("Cow",800,"Farm",false,700);

        myFarm.add(myNewCat);
        myFarm.add(mySecondCat);
        myFarm.add(myNewCow);
        myFarm.add(mySecondCow);

        System.out.println(myNewCow.feed("Grass"));
        System.out.println(myNewCat.feed("Mouse"));
        System.out.println(myNewCow.toString());
        System.out.println(myNewCow.makeSound());

        for (Animal currentAnimal: myFarm){
            //Cat currentCat = (Cat)currentAnimal; // DownCasting
            System.out.println(currentAnimal.feed("Any Food"));
            System.out.println(currentAnimal.makeSound());
            System.out.println(currentAnimal);
        }

    }
}
