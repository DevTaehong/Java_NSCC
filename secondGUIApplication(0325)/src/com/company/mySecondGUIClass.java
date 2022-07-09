package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mySecondGUIClass extends JFrame {
    // Constructor
    public mySecondGUIClass(){
        this.setTitle("My Second GUI Application");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(150,150,700,700);

        // set up my JPanel for this frame

        // This is the parent one (Content Pane)
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        this.setContentPane(contentPane); // this.setContentPane = contentPane;
        contentPane.setLayout(new CardLayout(0,0)); // For the parent JPanel

        // First Panel
        JPanel panelOne = new JPanel();
        panelOne.setBackground(Color.YELLOW);
        contentPane.add(panelOne);
        panelOne.setLayout(null);

        // Control Objects for panelOne
        JLabel labelOne = new JLabel("In Panel One");
        labelOne.setBounds(50,100,200,30);
        panelOne.add(labelOne);

        JButton buttonOne = new JButton("Go to Panel 2");
        buttonOne.setBounds(50,140,200,30);
        panelOne.add(buttonOne);

        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(new ImageIcon(getClass().getResource("/images/Smiley2.jpg")));
        imageLabel.setBounds(50,180,500,500);
        panelOne.add(imageLabel);

        // Second panel
        JPanel panelTwo = new JPanel();
        panelTwo.setBackground(Color.green);
        contentPane.add(panelTwo);
        panelTwo.setLayout(null);

        JLabel labelTwo = new JLabel("In Panel Two");
        labelTwo.setBounds(50,100,200,30);
        panelTwo.add(labelTwo);

        JButton buttonTwo= new JButton("Go to Panel 1");
        buttonTwo.setBounds(50,140,200,30);
        panelTwo.add(buttonTwo);

        // Action Listeners
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelOne.setVisible(false);
                panelTwo.setVisible(true);
            }
        });

        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelTwo.setVisible(false);
                panelOne.setVisible(true);
            }
        });

        // Calculate the Circle Area
        // Use JOptionPane to show a message dialog which contains the area of tha result




    }






























}
