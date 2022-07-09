package com.company;

public class Course {
    private String courseName;
    private Student[] type = new Student[6];

    public Course(String courseName){
        this.courseName=courseName;
        for (int i=0; i<6; i++){ // Initializing
            type[i] = new Student("",0,0);
        }
    }

    public String getCourseName() { // Getter method for course's name
        return courseName;
    }

    public void setCourseName(String courseName) { // Setter method for course name
        this.courseName = courseName;
    }

    public Student[] getType() { // Getter method for student array
        return this.type;
    }


}
