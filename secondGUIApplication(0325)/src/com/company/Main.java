package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        mySecondGUIClass frame = new mySecondGUIClass();
//        frame.setVisible(true);

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    mySecondGUIClass frame = new mySecondGUIClass();
                    frame.setVisible(true);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });




























    }
}
