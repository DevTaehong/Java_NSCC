package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Initialization
        //int numberOfCourses=2;
        int numberOfStudents = 6; // represents number of students per course
        String courseName; // To be used in Course constructor.
        // Variables for student name and two marks.
        // To be passed for each student object(Student's class Constructor or setter function)
        String studentName;
        double mark1;
        double mark2;
        ArrayList<Course> courses = new ArrayList<Course>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Programming IT Courses\nCOURSE ENTRY\n");
        printAline();
        //System.out.println("=".repeat(50));

        // Course Objects Instantiating
        /* --------- First Method for Courses Instantiating-----------------------------*/
//        System.out.println("\nEnter name for course # 1:");
//        courseName=sc.nextLine();
//        // Input Validation
//        while (courseName.length()<3){
//            System.out.println("Please enter a valid name, at least 3 characters long.");
//            courseName = sc.nextLine();
//        }
//        Course course1 = new Course(courseName);
//        courses.add(course1);
//        System.out.println("Enter name for course # 2:");
//        courseName=sc.nextLine();
//        // Input Validation
//        while (courseName.length()<3){
//            System.out.println("Please enter a valid name, at least 3 characters long.");
//            courseName = sc.nextLine();
//        }
//        Course course2 = new Course(courseName);
//        courses.add(course2);
        /* --------- End of the First Method for Courses Instantiating------------------*/

        /* --------- Second Method for Courses Instantiating-----------------------------*/
        for (int i=0;i<2; i++){
            System.out.println(String.format("\nEnter name for course # %d:",i+1));
            courseName=sc.nextLine();
            while (courseName.length()<3){
                System.out.println("Please enter a valid Course name, at least 3 characters long.");
                courseName = sc.nextLine();
            }
            courses.add(new Course(courseName));
        }
        /* --------- End of the Second Method for Courses Instantiating------------------*/

        // Student Objects Instantiating
        System.out.println("Student Entry\n");
        printAline();
        //System.out.println("=".repeat(50));

        for (int i = 0; i<courses.size(); i++) {

            System.out.println(String.format("\nEnter students for %s : ", courses.get(i).getCourseName()));
            for (int j = 0; j<numberOfStudents; j++) {
                // Student info input
                System.out.println(String.format("Enter student # %d name: ", j + 1));
                studentName = sc.nextLine();
                // Input Validation
                while (studentName.length()<3){
                    System.out.println("Please enter a valid name, at least 3 characters long.");
                    studentName = sc.nextLine();
                }
                System.out.println(String.format("Enter assignment1 mark for %s ", studentName));
                mark1 = sc.nextDouble();
                //Input Validation
                while(mark1<0 || mark1 >20){
                    System.out.println("Enter a valid mark between 1 and 20");
                    mark1=sc.nextDouble();
                }
//                System.out.println(String.format("Enter assignment2 mark for %s ", stName));
//                mark2 = sc.nextDouble();
//                //Input Validation
//                while(mark2<0 || mark2 >20){
//                    System.out.println("Enter a valid mark between 1 and 20");
//                    mark2=sc.nextDouble();
//                }
                //Another method for input validation
                mark2 = getDouble("Enter assignment2 mark for "+studentName);
                sc.nextLine(); // To handle the new Line Character starting from the second entry of student name.

                // Instantiating student's objects
                // Instantiation student object using the parametrized constructor &
                // Add it to the array of objects.
                courses.get(i).addStudent(new Student(studentName)); // Using the default constructor of student's class
                // Now the j-th object of student is created.
                // Setting the values of mark1 & marks properties using their setter functions.
                courses.get(i).getStudents().get(j).setAssignment1Mark(mark1);
                courses.get(i).getStudents().get(j).setAssignment2Mark(mark2);
            }
        }
        // Course's Report
        System.out.println("\nREPORT : Stats per Course\n");
        printAline();
        //System.out.println("=".repeat(50));
        for (Course currentCourse:courses) {
            System.out.println(currentCourse.courseReport());
        }

        // Student's Reports
        System.out.println("\nREPORT : Stats per student\n");
        printAline();
        //System.out.println("=".repeat(50));
        for (Course currentCourse:courses) {
            System.out.println(currentCourse.studentsReport());
        }
    }
    public static double getDouble(String msg){
        double number ;
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        do {
            System.out.println("The mark should be between 0 and 20");
            while (!sc.hasNextInt()) { // It is better to use hasNextDouble instead of hasNextInt
                System.out.println("Enter a positive number between 0 and 20.");
                sc.next();
            }
            number = sc.nextInt();
        } while (number < 0 || number >20);
        return number;
    }
    public static void printAline(){
        System.out.println("=====================================");
    }
}
