package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Programming IT Courses");
        System.out.println("COURSE ENTRY");
        System.out.println("===========================================");

        Scanner sc = new Scanner(System.in); // Making new scanner sc
        System.out.println("Enter name for course # 1:");
        String name = sc.nextLine(); // name receives course 1 name
        Course cname1 = new Course(name); // Making Object cname

        System.out.println("Enter name for course # 2:");
        String name2 = sc.nextLine(); // name2 receives course 2 name
        Course cname2 = new Course(name2); // Making Object cname2


        System.out.println("Student Entry");

        double sum = 0.0; // Initialized sum
        double sum2 = 0.0; // Initialized sum2

        System.out.println("Enter students for " + cname1.getCourseName()); // Print course 1 name
        for (int i=0; i<cname1.getType().length; i++){ // 6 students = length
            System.out.println("Enter name for student # " + (i+1) + ":");
            String sName = sc.nextLine(); // sName receives student name
            cname1.getType()[i].setName(sName); // Storing each student name

            System.out.println("Enter Assignment1 mark for " + sName);
            double mark1 = sc.nextDouble();
            cname1.getType()[i].setMarks1(mark1); // Storing each student mark1

            System.out.println("Enter Assignment2 mark for " + sName);
            double mark2 = sc.nextDouble();sc.nextLine();
            cname1.getType()[i].setMarks2(mark2); // Storing each student mark2
            sum = sum + mark1;
            sum2 = sum2 + mark2;

        }
        double avg = (sum+sum2) / 2; // Setting avg variable for average

        double sum3 = 0.0; // Initialized sum3
        double sum4 = 0.0; // Initialized sum4

        System.out.println("Enter students for " + cname2.getCourseName());
        for (int i=0; i<cname2.getType().length; i++){
            System.out.println("Enter name for student # " + (i+1) + ":");
            String sName = sc.nextLine(); // sName receives student name
            cname2.getType()[i].setName(sName); // Storing each student name

            System.out.println("Enter Assignment1 mark for " + sName);
            double mark1 = sc.nextDouble();
            cname2.getType()[i].setMarks1(mark1); // Storing each student mark1

            System.out.println("Enter Assignment2 mark for " + sName);
            double mark2 = sc.nextDouble();sc.nextLine();
            cname2.getType()[i].setMarks2(mark2); // Storing each student mark2
            sum3 = sum3 + mark1; // Increment of sum3
            sum4 = sum4 + mark2; // Increment of sum4
        }
        double avg2 = (sum3+sum4) / 2; // Setting avg2 variable for average


        System.out.println("REPORT: Stats per Course");
        System.out.println("===========================================");
        System.out.println(cname1.getCourseName() + " : Assignment1 - " + sum3 + " Assignment2 - " + sum4 + " Average - "+ ((sum+sum2)/2));
        if(avg >=100){ // Setting range of each rating
            System.out.println("Course Rating: A");
        }
        else if(avg>=70 && avg<100){
            System.out.println("Course Rating: B");
        }

        else if(avg>=50 && avg<70){
            System.out.println("Course Rating: C");
        }

        else if(avg<70){
            System.out.println("Course Rating: D");
        }

        System.out.println(cname2.getCourseName() + " : Assignment1 - " + sum + " Assignment2 - " + sum2 + " Average - "+ ((sum3+sum4)/2));
        if(avg2 >=100){ // Setting range of each rating
            System.out.println("Course Rating: A");
        }
        else if(avg2>=70 && avg2<100){
            System.out.println("Course Rating: B");
        }

        else if(avg2>=50 && avg2<70){
            System.out.println("Course Rating: C");
        }

        else if(avg2<70){
            System.out.println("Course Rating: D");
        }
        System.out.println("");
        System.out.println("REPORT: Stats per student");
        System.out.println("===========================================");
        System.out.println(cname1.getCourseName());

        for (Student myStudent: cname1.getType()) {
            System.out.println(myStudent.reportInfo()); // Print report for course 1
        }

        System.out.println(cname2.getCourseName());

        for (Student myStudent2: cname2.getType()) {
            System.out.println(myStudent2.reportInfo()); // Print report for course 2
        }





























    }
}
