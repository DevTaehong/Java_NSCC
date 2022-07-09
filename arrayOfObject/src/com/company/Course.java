package com.company;

import java.util.ArrayList;

public class Course {
    // Member Variables (Properties)
    private String courseCode;
    private ArrayList<Student> classList2;

    // Constructor for the classLst2 Property
    public Course(){
        this.classList2 = new ArrayList<Student>();
    }



    // Setter Method (Constructor)
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    // Getter for the array list
    public ArrayList<Student> getClassList2() {
        return classList2;
    }

    // The getter method
    public String getCourseCode() {
        return courseCode;
    }
}
