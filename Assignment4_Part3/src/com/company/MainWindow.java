package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MainWindow extends JFrame {

    private JPanel contentPane;
    public MainWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout(0, 0));

        //Make our own JPanel
        DrawingPanel drawing = new DrawingPanel();
        drawing.setBackground(Color.WHITE);

        contentPane.add(drawing, "name_257973040435998");
        drawing.setLayout(null);
    }
}

