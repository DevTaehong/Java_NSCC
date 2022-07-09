package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        User firstUser = new User();
//        firstUser.userName = "Yousef Abu Baker";
//        firstUser.email = "abcde@gmail.com";


        User secondUser = new User("Yousef", "abcde@gmail.com", 15.5);
        User thirdUser = new User("Taehong", "minth1123@naver.com", 350);
        secondUser.reportInfo();
        thirdUser.reportInfo();
        int result1 = secondUser.report(10);
        System.out.println("The result is:" + result1);
        int result2 = result1-20;
        User fourthUser = new User();
        fourthUser.setUserName("Eduardo");
        fourthUser.setEmail("kkkkkk@gmail.com");
        fourthUser.reportInfo();
        System.out.println("The fourth user name is : " + fourthUser.getUserName());
        System.out.println("The second user name is : " + secondUser.getUserName());
        System.out.println("The email of the second user is : " + secondUser.getEmail());

















    }
}
