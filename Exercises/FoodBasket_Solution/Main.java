package ca.nscc;

public class Main {

    public static void main(String[] args) {

        //Declare my object array & variables
        String msg;
        Food[] picnicBasket = new Food[6];

        //Create some food objects
        Food snack1 = new Food("Banana", "Fruit");
        Food snack2 = new Food("Yam", "Vegetable");
        Food snack3 = new Food("Beef Jerky", "Meat");
        Food snack4 = new Food("Yoghurt", "Dairy");
        Food snack5 = new Food("Orange", "Fruit");
        Food snack6 = new Food("Brussel Sprouts", "Vegetable");

        //Add food objects to my array
        picnicBasket[0] = snack1;
        picnicBasket[1] = snack2;
        picnicBasket[2] = snack3;
        picnicBasket[3] = snack4;
        picnicBasket[4] = snack5;
        picnicBasket[5] = snack6;

        //Go through my picnic basket array
        for (int i = 0; i < picnicBasket.length; i++) {
            Food currentItem = picnicBasket[i];

            //Yuck, I hate veggies! I won't eat em!
            if (currentItem.foodType == "Vegetable") {
                msg = currentItem.denyIt();
                System.out.println(msg);
            } else {
                msg = currentItem.eatIt();
                System.out.println(msg);
            }
        }
    }
}
