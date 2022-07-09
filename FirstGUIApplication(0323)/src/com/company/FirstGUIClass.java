package com.company;

import javax.swing.*;

public class FirstGUIClass {
    // Constructor
    public FirstGUIClass(){
        JFrame f = new JFrame();

        JButton b = new JButton("Click From class");
        b.setBounds(120,200,250,25);
        f.add(b);

        // Think about changing background color

        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);


    }















}
