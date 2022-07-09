package com.company;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

public class MainWindow extends JFrame {

    private JPanel contentPane;

    /**
     * Create the frame. This is the done inside the Constructor.
     */
    public MainWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(250, 70, 777, 777);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout(0, 0));

        //This object USED to be the panel shown to the user, containing any
        //GUI controls we put on the form.
        //JPanel panel = new JPanel();

        //However, we created our OWN class that INHERITS from JPanel, and
        //that's what we're instancing here, and adding to the main contentPane.
        //Therefore, OUR graphics (as coded in the new subclass) get shown on screen instead.
        DrawingBoard db = new DrawingBoard();
        contentPane.add(db);

    }

}
