package ca.nscc;

//Person is the superclass
public class Person {
    //Person properties
    private String firstName;
    private String lastName;
    private boolean invited;

    //Person constructor
    public Person(String firstName, String lastName, boolean invited) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.invited = invited;
    }

    //Getter for isInvited property
    public boolean isInvited() {
        return invited;
    }

    //Method for building the full name (first & last) as a single string
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
