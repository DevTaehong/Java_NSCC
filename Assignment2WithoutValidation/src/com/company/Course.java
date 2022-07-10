package com.company;

import java.util.ArrayList;

public class Course {
    // Properties- Member Variables-Attributes
    private String courseName;
    private ArrayList<Student> students = new ArrayList<Student>();

    // Constructor for the first property (name)
    public Course(String name) {
        this.courseName = name;
    }

    // Using Refactor : Getters/Setters for name & Array of students(Array of Object)
    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    // Method for adding student object to array of students. (The second attribute of this class)
    public void addStudent(Student student) {
        this.students.add(student);
    }

    public String courseReport() {
        double assignment1Total=0;
        double assignment2Total=0;
        double average;
        String courseRating;
        for (int i = 0; i < this.students.size(); i++) {
            assignment1Total += this.students.get(i).getAssignment1Mark(); // Calculating Assignment 1 total
            assignment2Total += this.students.get(i).getAssignment2Mark(); // Calculating Assignment 1 total
        }
        average = (assignment1Total + assignment2Total) / 2;

        if (average >= 100) {
            courseRating = "A";
        }
        else if (average >= 70) {
            courseRating = "B";
        }
        else if (average >= 50) {
            courseRating = "C";
        }
        else { courseRating = "F";
        }
        return String.format("%s: Assignment1 - %.2f\t\tAssignment2 - %.2f\t\tAverage - %.2f\nCourse Rating: %s",
                this.courseName, assignment1Total, assignment2Total, average, courseRating);

    }

    public String studentsReport() {
        String result="";
        System.out.println(String.format("%s\n", this.courseName)); // Course name header

        for (int i = 0; i < this.students.size(); i++) {
            result += this.students.get(i).studentReport(); // Retrieving student's report individually
        }
        return result;
    }
}
