package com.company;

public class Student {
    //1. properties of Student Class
    private String firstName;
    private String lastName;
    private String wNumber;
    private int age;
    private boolean isFulltime;

    // Constructor is the second important part of any class
    //This is a the default constructor

    public Student(String fName,String lName,String stdID, int age,
                    boolean isFulltime)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.wNumber = stdID;
        this.age=age;
        this.isFulltime=isFulltime;
    }


    // Methods which represent different behaviour for any Student
    public void report1Info()
    {
        System.out.println(this.firstName+" " + this.lastName +" "+this.wNumber);

    }
    String report2Info()
    {
        String report=String.format("Name : %S , %S, ID Number : %S Age : %d FullTime : %b",
                this.lastName,this.firstName,this.wNumber,this.age,this.isFulltime);
        return report;
    }



}
