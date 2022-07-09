package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class inheritedGUIClass extends JFrame {
    // Constructor
    public inheritedGUIClass(){

        // Buttons
        JButton b = new JButton("Click from inherited Class");
        b.setBounds(50,100,200,30);



        // Labels
        JLabel myLabel = new JLabel("Enter Your name");
        myLabel.setBounds(50,140,200,30);

        // Text Box
        JTextField myName = new JTextField();
        myName.setBounds(160,180,200,30);
        add(myName);

        // Radio Buttons
        JRadioButton radioYes = new JRadioButton("Yes",false);
        radioYes.setBounds(50,220,80,30);
        add(radioYes);

        JRadioButton radioNo = new JRadioButton("No",true);
        radioNo.setBounds(140,220,80,30);
        add(radioNo);

        // Color Picker
        JColorChooser colorPicker = new JColorChooser();
        colorPicker.setBounds(50,260,240,240);
        add(colorPicker);

        // Adding our control objects to the Frame (그냥 for readable)
        add(b);
        add(myLabel);

        radioYes.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                myName.setText("Welcome to NSCC.");
                myName.setBackground(Color.CYAN);
            }
        });





        setSize(400,800);//400 width and 500 height
        setLayout(null);//using no layout managers
        setVisible(true);

    }
}
