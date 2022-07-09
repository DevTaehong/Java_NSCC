package com.company;

public class Adder {
    public String add(String value1, String value2){
        return value1.concat(value2);
    }
    public int add(int value1, int value2){
        return value1+value2;

    }
    public int add(int value1, int value2, int value3){
        return value1+value2+value3;

    }
    public int add(int value1, String value2){
        return value1 + Integer.parseInt(value2);

    }
    public String add(String value1, int value2){
        return value1 + Integer.toString(value2);

    }
    // Method Overriding
    public String toString(){
        return "hello world";
    }

}

