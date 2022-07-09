package com.company;

public class Main
{
    public static void main(String[] args) {
        // write your code here
        Food[] picnicBasket = new Food[3];


        Food foodOne = new Food("Pork", "Meat");
        Food foodTwo = new Food("Milk", "Diary");
        Food foodThree = new Food("Beef", "Meat");

        picnicBasket[0] = foodOne;
        picnicBasket[1] = foodTwo;
        picnicBasket[2] = foodThree;

        for(int i=0 ; i<picnicBasket.length; i++){
            //If Conditional statement to decide per item (Food object) whether to call eatIt or denyIt.
            if(picnicBasket[i].getFoodType().equals("Diary")){
                picnicBasket[i].denyIt();
            }else{
                picnicBasket[i].eatIt();
            }
        }
    }
}

















