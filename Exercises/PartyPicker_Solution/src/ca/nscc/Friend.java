package ca.nscc;

//Friend inherits from Person
public class Friend extends Person{

    //Properties
    private String foodToBring;

    //Constructor, uses super to pass incoming values to superclass, where appropriate
    public Friend(String firstName, String lastName, boolean isRegistered, String foodToBring) {
        super(firstName, lastName, isRegistered);
        this.foodToBring = foodToBring;
    }

    //Overridden toString() method, returns a description of the Friend, including properties from the superclass
    public String toString() {

        //Set invited string to be empty or contain the word NOT, to add into the appropriate place in the final string
        //Note call to super
        String invited = "";
        if (!super.isInvited()) { invited = " NOT "; }

        //Build the description string. Note call to super
        return super.getFullName() + " is bringing " + this.foodToBring + ". They are " + invited + " invited to the party.";
    }
}
