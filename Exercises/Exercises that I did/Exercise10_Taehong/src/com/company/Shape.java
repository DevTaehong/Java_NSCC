package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Shape extends JFrame {

    public Shape(){
        this.setTitle("Shape Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300,150,700,300);

        // This is the parent one (Content Pane)
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        this.setContentPane(contentPane); // this.setContentPane = contentPane;
        contentPane.setLayout(new CardLayout(0,0)); // For the parent JPanel

        // First Panel
        JPanel panelOne = new JPanel();
        contentPane.add(panelOne);
        panelOne.setLayout(null);

        JRadioButton radioCircle = new JRadioButton("Circle",false);
        radioCircle.setBounds(70,60,150,30);
        panelOne.add(radioCircle);

        JRadioButton radioTriangle = new JRadioButton("Triangle",false);
        radioTriangle.setBounds(70,110,150,30);
        panelOne.add(radioTriangle);

        JRadioButton radioRectangle = new JRadioButton("Rectangle",false);
        radioRectangle.setBounds(70,160,150,30);
        panelOne.add(radioRectangle);

        ButtonGroup group = new ButtonGroup();
        group.add(radioCircle);
        group.add(radioTriangle);
        group.add(radioRectangle);

        JTextField textRadius = new JTextField();
        textRadius.setBounds(380,60,90,30);
        panelOne.add(textRadius);


        JLabel labelRadius = new JLabel("Radius:");
        labelRadius.setBounds(290,60,200,30);
        panelOne.add(labelRadius);



        radioCircle.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String print = textRadius.getText();
                double area=(Double.parseDouble(print) * Double.parseDouble(print)) * Math.PI;
                DecimalFormat area2 = new DecimalFormat("#.##");
                JOptionPane.showMessageDialog(null,"\n" + area2.format(area));
            }
        });
    }
}
