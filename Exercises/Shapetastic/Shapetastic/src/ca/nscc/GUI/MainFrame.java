package ca.nscc.GUI;

import ca.nscc.Classes.Circle;
import ca.nscc.Classes.Rectangle;
import ca.nscc.Classes.ShapeColor;
import ca.nscc.Classes.Triangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame {

    private static Circle theCircle;
    private static Rectangle theRectangle;
    private static Triangle theTriangle;
    private static ArrayList<ShapeColor> colors = new ArrayList<ShapeColor>();
    private static int selectedColor = 0;

    public MainFrame() {    //Constructor

        // Create list of color objects
        ShapeColor redColor = new ShapeColor("Red", 255, 0, 0);
        ShapeColor greenColor = new ShapeColor("Green", 0, 255, 0);
        ShapeColor blueColor = new ShapeColor("Blue", 0, 0, 255);

        colors.add(redColor);
        colors.add(greenColor);
        colors.add(blueColor);

        //Create "default" shape objects
        theCircle = new Circle(null, 10);
        theRectangle = new Rectangle(null, 5, 20);
        theTriangle = new Triangle(null, 12, 19);

        //Set Frame Properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 750, 750);
        setTitle("Shapetastic!");
        setLayout(new CardLayout());

        //Add Panel "screens"
        ChoosePanel chooseScreen = new ChoosePanel();
        DisplayPanel displayScreen = new DisplayPanel();
        add(chooseScreen);
        add(displayScreen);

        //Set Nav buttons
        JButton displayBtn = chooseScreen.getDisplayBtn();
        displayBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                chooseScreen.setVisible(false);
                chooseScreen.createShape();
                displayScreen.displayChoice();
                displayScreen.setVisible(true);
            }
        });
    }

    public static Circle getTheCircle() {
        return theCircle;
    }

    public static Rectangle getTheRectangle() {
        return theRectangle;
    }

    public static Triangle getTheTriangle() {
        return theTriangle;
    }

    public static ArrayList<ShapeColor> getColors() {
        return colors;
    }

    public static void setSelectedColor(int index) {
        MainFrame.selectedColor = index;
    }

    public static int getSelectedColor() {
        return MainFrame.selectedColor;
    }
}
