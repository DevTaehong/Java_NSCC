package ca.nscc;

public class Car {

    //What properties does my car have?
    String make;
    String model;
    int manufYear;
    boolean isAutomatic;

    //Constructor method
    public Car(String make, String model, int manufYear, boolean isAutomatic){
        this.manufYear = manufYear;
        this.make = make;
        this.model = model;
        this.isAutomatic = isAutomatic;
    }

    //Actions (methods) a car can do
    public void accelerate(){

    }

    public void brake() {

    }

    public void turnLeft(){

    }

    public void turnRight(){

    }
}
