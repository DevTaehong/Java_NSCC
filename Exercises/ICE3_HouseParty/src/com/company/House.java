package com.company;

public class House {
    private int length;
    private int width;
    private String colour;
    private double housePrice;

    public House (int hLength, int hWidth, String colour, double hHousePrice){
        this.colour = colour;
        this.length = hLength;
        this.width = hWidth;
        this.housePrice = hHousePrice;
    }


    public void printTotalArea()
    {
        System.out.println("\nThe total square footage of the house is: " + this.length * this.width +
                "\nYour house's colour is: " + this.colour + " and price is: " + this.housePrice);
    }
























}
