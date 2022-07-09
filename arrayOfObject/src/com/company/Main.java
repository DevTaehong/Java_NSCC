package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        Student[] classList = new Student[3];


//        classList[0] = new Student("Yousef", "Abu Baker", "w12345"
//                , 34, true);
//
//        classList[1] = new Student("Zack", "McNeil", "w23456",
//                24, false);
//
//        classList[2] = new Student("Lilyan", "ABCDE", "w44444",
//                52, false);

//        for (int i=0; i<classList.length; i++){
//            System.out.println(classList[i].report2Info());
//        }
//        for (Student myStudent : classList) {
//            System.out.println(myStudent.report2Info());
//        }


        // Declaring Array List
        ArrayList<Student> classList1 = new ArrayList<Student>();
        classList1.add(new Student("Yousef", "Abu Baker", "w12345"
                , 34, true));
        classList1.add(new Student("ABCD", "DEFG", "w99999"
                , 50, false));

        for (Student myStudent : classList1) {
            System.out.println(myStudent.report2Info());
        }
//        for (int i=0; i<classList1.size(); i++){
//            System.out.println(classList1[i].report2Info());
//        }

        // Dealing with new Course
        Course oopCourse = new Course();
        oopCourse.setCourseCode("PROG1400");
        Course dataBase = new Course();
        dataBase.setCourseCode("DB2000");

        System.out.println(oopCourse.getCourseCode());
        System.out.println(dataBase.getCourseCode());

        // Adding Student to OOP Course
        oopCourse.getClassList2().add(new Student("Yousef", "Abu Baker", "w12345"
                , 34, true));
        oopCourse.getClassList2().add(new Student("ABCD", "Abu Baker", "w12345"
                , 34, true));

        for (Student myStudent: oopCourse.getClassList2()) {
            System.out.println(myStudent.report2Info());
        }















    }
}
