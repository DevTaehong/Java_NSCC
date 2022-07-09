package ca.nscc;

public class Main {

    public static void main(String[] args) {

        //Create a car
        Car geoffsCar  = new Car("Ford", "Tundra",
                2018, true);

        Car bensCar = new Car("Saturn", "SL2",
                1995, true);

        Car tomsCar = new Car("Lamborghini", "Scientology",
                2020, false);

        geoffsCar.brake();
        tomsCar.accelerate();
        bensCar.turnLeft();

        System.out.println(geoffsCar.make);

    }
}
