package com.company;

import java.util.Random;

public class User {
    // Members Variable (Properties)
     private String userName;
     private String email;
     private String userRate;
     private String userToken;

    // Constructor
    public User(){}

    // Customized Constructor
    public User (String p_userName, String p_email, double userDonation){
        this.userName = p_userName;
        this.email = p_email;
        // Now I will assign a value to userRate depending upon the donation or the payment
        if (userDonation>300){
            this.userRate="Class A";
        }
        else if (userDonation>100.00){
            this.userRate="Class B";
        }
        else {
            this.userRate="Class C";
        }
        this.userToken = this.generateToken();
    }

    public User (String p_userRate){
        this.userRate = p_userRate;
    }



    // Methods
    public int report (int value){
        int result = 5 * value;
        return result;
    }

    public void reportInfo(){
        System.out.println(String.format("User : %s, Email : %s, Level : %s Token: %s", this.userName
                , this.email, this.userRate,this.userToken));
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        this.userToken = this.generateToken();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    private String generateToken(){
        Random myRandom = new Random();
        int randomDigit = myRandom.nextInt(50000)+10000; // to guarantee 5 digits retrieval
        return this.userName + Integer.toString(randomDigit);
    }















}
