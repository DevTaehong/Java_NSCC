package com.company;

import java.util.Locale;

public class Animal {
    // Step 1: Member variables (Properties)
    private String species;
    private int maxWeight;
    private String habitat;
    private boolean isEndangered;

    // Step2 : Default Constructor
    public Animal (){
        this.species = "Cat";
        this.maxWeight = 15;
        this.habitat = "House";
        this.isEndangered = false;
    }

    // Step 3: a parametrized (Customized) constructor
    public Animal(String species, int maxWeight, String habitat, boolean isEndangered){
        this.species = species;
        this.maxWeight = maxWeight;
        this.habitat = habitat;
        this.isEndangered = isEndangered;
    }

    // Step 5: Getter
    public String getSpecies() {
        return species;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public String getHabitat() {
        return habitat;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    // Step 6: Public Methods
    // Feed method
    public String feed(String food){
        return String.format("The %s, ate a %s.",this.species,food);
    }
    // MakeSound method
    public String makeSound(){
        String sound = "";
        if (this.species.toUpperCase().equals("CAT")){ //this.species.toLowerCase() == "CAT"
            sound = "Meow";
        }
        else if (this.species.toUpperCase().equals("LION")){
            sound="RRR";
        }
        else if (this.species.toUpperCase().equals("DOG")){
            sound="WowWow";
        }
        else if (this.species.toUpperCase().equals("COW")){
            sound="MOO";
        }
        return String.format("The %s make a %s sound.", this.species, sound);
    }

    // Third Method which is using toString() method
    // This is called Overriding
    public String toString(){
        if (this.isEndangered){
            return String.format("I am a %d lb %s that lives in the %s. I am an Endangered species",
                    this.maxWeight, this.species, this.habitat);
        }
        else {
            return String.format("I am a %d lb %s that lives in the %s. I am an NOT Endangered species",
                    this.maxWeight, this.species, this.habitat);
        }
    }
}
