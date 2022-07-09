package ca.nscc;

public class Food {

    String name;
    String foodType;

    public Food(String name, String foodType) {
        this.name = name;
        this.foodType = foodType;
    }

    public String eatIt() {
       return "You just ate the " + this.name + ".";
    }

    public String denyIt() {
        return "Yuck! I won't eat this " + this.name + "!";
    }
}
