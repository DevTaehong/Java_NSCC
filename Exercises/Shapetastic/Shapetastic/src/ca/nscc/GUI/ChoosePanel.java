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

public class ChoosePanel extends JPanel {

    //Some controls need to be declared at the class level, if referenced in multiple places
    private JButton displayBtn;
    private JLabel dimensionsLabel;
    private JLabel imageLabel;
    private JTextField nameText;
    private JRadioButton rdoCircle;
    private JRadioButton rdoRectangle;
    private JRadioButton rdoTriangle;

    private JRadioButton rdoRed;
    private JRadioButton rdoGreen;
    private JRadioButton rdoBlue;

    private Circle circle = null;
    private Rectangle rect = null;
    private Triangle tri = null;


    public ChoosePanel() {

        //Set font object
        Font myFont = new Font("Calibri", Font.BOLD, 24);

        //Set Panel Properties
        setLayout(null);
        setVisible(true);

        //Create all GUI objects
        //Radiobutton for each shape
        addShapeRadios(myFont);
        // Radiobuttons for each colour
        addColourRadios(myFont);

        //Label control for name
        JLabel nameLabel = new JLabel("Name your shape:");
        nameLabel.setFont(myFont);
        nameLabel.setBounds(50, 10, 200, 50);

        //Textfield control for name
        nameText = new JTextField();
        nameText.setFont(myFont);
        nameText.setBounds(260, 10, 200, 50);

        //Labels to show dimensions of each shape in a single field
        dimensionsLabel = new JLabel();
        dimensionsLabel.setFont(myFont);
        dimensionsLabel.setBounds(260, 70, 300, 50);

        //Label for shape image
        imageLabel = new JLabel();
        imageLabel.setBounds(500, 70, 150, 150);

        //Change screen button
        displayBtn = new JButton("Display Selected");
        displayBtn.setFont(myFont);
        displayBtn.setBounds(500, 220, 200, 50);

        //Add all controls to Panel
        add(rdoCircle);
        add(rdoRectangle);
        add(rdoTriangle);
        add(rdoRed);
        add(rdoGreen);
        add(rdoBlue);
        add(nameLabel);
        add(nameText);
        add(imageLabel);
        add(dimensionsLabel);
        add(displayBtn);
    }

    private void addColourRadios(Font myFont) {
        ShapeColor color = MainFrame.getColors().get(0);
        rdoRed = new JRadioButton(color.getColorName());
        rdoRed.setBackground(new Color(color.getrValue(), color.getgValue(), color.getbValue()));
        rdoRed.setFont(myFont);
        rdoRed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                MainFrame.setSelectedColor(0);
                createShape();
            }
        });
        color = MainFrame.getColors().get(1);
        rdoGreen = new JRadioButton(color.getColorName()); // Green
        rdoGreen.setBackground(new Color(color.getrValue(), color.getgValue(), color.getbValue()));
        rdoGreen.setFont(myFont);
        rdoGreen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                MainFrame.setSelectedColor(1);
                createShape();
            }
        });
        color = MainFrame.getColors().get(2);
        rdoBlue = new JRadioButton(color.getColorName()); // Blue
        rdoBlue.setBackground(new Color(color.getrValue(), color.getgValue(), color.getbValue()));
        rdoBlue.setFont(myFont);
        rdoBlue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                MainFrame.setSelectedColor(2);
                createShape();
            }
        });

        JLabel nameLabel = new JLabel("Pick the shape's color:");
        nameLabel.setFont(myFont);
        nameLabel.setBounds(50, 220, 300, 50);
        add(nameLabel);

        rdoRed.setBounds(50, 270, 150, 50);
        rdoGreen.setBounds(50, 320, 150, 50);
        rdoBlue.setBounds(50, 370, 150, 50);

        //ButtonGroup to group the radio buttons
        ButtonGroup grpColorRadios = new ButtonGroup();
        grpColorRadios.add(rdoRed);
        grpColorRadios.add(rdoGreen);
        grpColorRadios.add(rdoBlue);
    }

    private void addShapeRadios(Font myFont) {
        rdoCircle = new JRadioButton("Circle");
        rdoCircle.setFont(myFont);
        rdoCircle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                circle = MainFrame.getTheCircle();
                dimensionsLabel.setText(circle.getDimensionsString());
                swapImages(circle.getCirclePic());
            }
        });

        rdoRectangle = new JRadioButton("Rectangle");
        rdoRectangle.setFont(myFont);
        rdoRectangle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                rect = MainFrame.getTheRectangle();
                dimensionsLabel.setText(rect.getDimensionsString());
                swapImages(rect.getRectanglePic());
            }
        });

        rdoTriangle = new JRadioButton("Triangle");
        rdoTriangle.setFont(myFont);
        rdoTriangle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                tri = MainFrame.getTheTriangle();
                dimensionsLabel.setText(tri.getDimensionsString());
                swapImages(tri.getTrianglePic());
            }
        });

        rdoCircle.setBounds(50, 70, 150, 50);
        rdoRectangle.setBounds(50, 120, 150, 50);
        rdoTriangle.setBounds(50, 170, 150, 50);

        //ButtonGroup to group the radio buttons
        ButtonGroup grpColorRadios = new ButtonGroup();
        grpColorRadios.add(rdoCircle);
        grpColorRadios.add(rdoRectangle);
        grpColorRadios.add(rdoTriangle);
    }

    public void createShape() {
        String name = nameText.getText();
        if (rdoCircle.isSelected()) {
            circle = MainFrame.getTheCircle();
            circle.setColor(MainFrame.getColors().get(MainFrame.getSelectedColor()));
            circle.setName(name);
        }
        else if (rdoRectangle.isSelected()) {
            rect = MainFrame.getTheRectangle();
            rect.setColor(MainFrame.getColors().get(MainFrame.getSelectedColor()));
            rect.setName(name);
        }
        else if (rdoTriangle.isSelected()) {
            tri = MainFrame.getTheTriangle();
            tri.setColor(MainFrame.getColors().get(MainFrame.getSelectedColor()));
            tri.setName(name);
        }
    }

    public void swapImages(ImageIcon image) {
        imageLabel.setIcon(image);
    }

    public JButton getDisplayBtn() {
        return displayBtn;
    }
}
