package com.company;

public class Food {

    private String foodName;
    private String foodType;

    public String getFoodName(){
        return this.foodName;
    }

    public String getFoodType(){
        return this.foodType;
    }

    public void setFoodName(String foodName){
        this.foodName = foodName;
    }

    public void setFoodType(String foodType){
        this.foodType = foodType;
    }

    public Food(String name, String type){
        this.foodName = name;
        this.foodType = type;
    }

    public void eatIt(){
        System.out.println("You just ate the " + this.foodName);
    }

    public void denyIt(){
        System.out.println("Not eating that! I hate " + this.foodType);
    }
}
