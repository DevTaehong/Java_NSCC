package ca.nscc.GUI;

import ca.nscc.Classes.Circle;
import ca.nscc.Classes.Rectangle;
import ca.nscc.Classes.Triangle;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {

    private Circle circle;
    private Rectangle rect;
    private Triangle tri;

    private JTextArea displayText;

    public DisplayPanel() {

        Font myFont = new Font("Calibri", Font.BOLD, 24);

        //Set Panel Properties
        setLayout(null);

        JLabel choiceLabel = new JLabel("Your choice of shape is:");
        choiceLabel.setFont(new Font("Calibri", Font.BOLD, 24));
        choiceLabel.setBounds(50, 10, 250, 50);

        displayText = new JTextArea();
        displayText.setBounds(50, 50, 500, 200);
        displayText.setFont(myFont);
        displayText.setLineWrap(true);
        displayText.setEnabled(false);
        displayText.setWrapStyleWord(true);

        add(choiceLabel);
        add(displayText);
    }

    public void displayChoice() {
        circle = MainFrame.getTheCircle();
        rect = MainFrame.getTheRectangle();
        tri = MainFrame.getTheTriangle();
        String text = "";

        if (circle.getName() != null && circle.getName() != "") {
            text = circle.toString();
        }
        else if (rect.getName() != null && rect.getName() != "") {
            text = rect.toString();
        }
        else if (tri.getName() != null && tri.getName() != "") {
            text = tri.toString();
        }
        displayText.setText(text);
    }
}
