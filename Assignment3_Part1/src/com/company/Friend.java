package com.company;

public class Friend extends Person{
    private String foodToBring;

    public Friend(String firstName, String lastName, boolean isRegistered, String foodToBring){
        super(firstName, lastName, isRegistered);
        this.foodToBring=foodToBring;
    }

    public String toString(){

        String invited = "";
        if (!super.isInvited()) {
            invited = " NOT ";
        }

        return (super.getFullName() + " is bringing " + this.foodToBring + ". They are " + invited + " invited to the party.");
    }

}
