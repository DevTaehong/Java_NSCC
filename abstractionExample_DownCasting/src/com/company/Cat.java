package com.company;

public class Cat extends Animal{
    // Extends means the following:
    //This class "Cat' will :
    // get all of Animal's properties.
    // and all methods
    // and all getters and setters

    // I will create the Cat properties
    private int whiskersLength;

    // We will create the Cat Constructor:
    // Cat Constructor
    public Cat(String species, int maxWeight, String habitat, boolean isEndangered, int whiskersLength){
        super(species,maxWeight,habitat,isEndangered);
        this.whiskersLength=whiskersLength;
    }

    public String toString(){
        return super.toString() + String.format(". Whisker Length is : %d CM",this.whiskersLength);
    }

//        public String makeSound(){
//        return String.format("The %s make a Moo sound.", super.getSpecies());
//    }
    public String Meow(){
        return String.format("The %s make a Meow sound.", super.getSpecies());
    }
























}
