package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // an Arraylist of Student objects
        ArrayList<Student> studentList = new ArrayList<Student>();

        // Make the first Student object
        Student studentOne = new Student ("Mike","Crocker","w5555555", 29,true);
        studentList.add(studentOne);

        // Make the second Student object
        Student studentTwo = new Student ("Sally","Jones","w4444444",23,false);
        studentList.add(studentTwo);

        // report student all student info
        System.out.println("Student info:");
        System.out.println("=====================================");
//        System.out.println(studentOne.reportInfo());


        // go over all students and report
        for (Student currentStudent: studentList) {
            System.out.println(currentStudent.reportInfo());
        }





















    }
}
