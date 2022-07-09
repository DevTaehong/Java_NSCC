package com.company;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    //Empty constructor (not really required)
    public DrawingBoard()
    {}

    //A JPanel has a built-in method (named paintComponent) that, when called, draws
    //any graphic elements on itself, provided any graphic elements have been defined. It uses
    //a Graphics parameter object to do any required drawing.
    //By creating our own JPanel class that inherits from JPanel, we can "take over" (ie. override)
    //the paintComponent method, and thus use it to draw whatever we want onscreen.
    //This method gets called when the panel is instantiated, refreshed, or whenever the panel is
    //told to repaint itself.
    @Override
    public void paintComponent(Graphics g)
    {
        //An example of creating a color object defined by RGB values
//		Color col = new Color(200, 100, 50);
//
        //An example of setting our "pen's" color, so that any subseuqnet drawing are done in that color
//		g.setColor(col);
//
        //Call our own circle method, passing the graphics object to it
//		drawCircle(g);
//
//		g.setColor(Color.GREEN);
//		drawSquare(g);
//
//		g.setColor(Color.CYAN);
//		drawFilledCircle(g);

        //drawLine(g);

        //The Graphics class is a superclass to another, more powerful graphics class called
        //Graphics2D. In this line, we're downcasting our parent class (g) to it's child
        //class of Graphics2D, so we can use some of the "fancier", more specific graphics actions
        //it contains.
        Graphics2D g2d = (Graphics2D)g;	//Downcasting from parent to child

        drawHourGlass(g2d);
        drawLine(g2d);
        drawCircle(g2d);
        drawSquare(g2d);
        drawFilledCircle(g2d);
    }



    //A method we built to demonstrate the use of the GeneralPath class, which can be used
    //to draw along a series of defined waypoints. Helpful when drawing irregular geometric
    //shapes, ie. anythign that's not a circle, square, rectangle, etc.
    private void drawHourGlass(Graphics2D g) {

        //Define a couple of arrays to hold x and y coordinates for the points we'll be drawing
        int[] xValues = {0,200,0,200};
        int[] yValues = {0,200,200,0};

        //Create a GeneralPath object, which will serve as our "drawing pen"
        GeneralPath pen = new GeneralPath();

        //pen.moveTo() moves our pen to the starting location, without drawing any lines
        pen.moveTo(xValues[0], yValues[0]);

        //pen.lineTo() tells our pen to move to each point location in turn, drawing a
        //line as it moves.
        pen.lineTo(xValues[1], yValues[1]);
        pen.lineTo(xValues[2], yValues[2]);
        pen.lineTo(xValues[3], yValues[3]);

        //pen.closePath() tells the line to draw a line back to the original start position,
        //thereby "closing" the shape.
        pen.closePath();

        g.draw(pen);	//Use the pen (with it's pre-defined path) to draw an outline of the shape
//        g.fill(pen);	//Use the pen (ie. path) to draw a FILLED shape.
    }

    private void drawLine(Graphics g) {
        //Example of drawing a line between two defined points.
        //Arguments are startingX, startingY, endingX, endingY
        g.drawLine(400, 100, 220, 220);
    }

    private void drawFilledCircle(Graphics g) {
        //fillOval draws the defined oval (or circle) at the location specified, of the specified size, and
        //fills it with the current pen color.
        g.fillOval(350, 200, 200, 200);
    }

    private void drawSquare(Graphics g) {
        //drawRect draws the outline of a rectangle (or square) at the specified location,
        //of the specified size
        g.drawRect(50, 450, 200, 200);

    }

    private void drawCircle(Graphics g) {
        //drawOval draws the outline of an oval (or circle) at the specified location,
        //of the specified size
        g.drawOval(500, 0, 200, 200);
    }

}
