package com.company;

public class Cow extends Animal{
    private int price;

    // We will create the Cat Constructor:
    // Cat Constructor
    public Cow(String species, int maxWeight, String habitat, boolean isEndangered, int price){
        super(species,maxWeight,habitat,isEndangered);
        this.price=price;
    }

    public String toString(){
        return super.toString() + String.format(". The price of it is : $%d",this.price);
    }
//    public String makeSound(){
//        return String.format("The %s make a Moo sound.", super.getSpecies());
//    }

    public String Moo(){
        return String.format("The %s make a Moo sound.", super.getSpecies());
    }

}
