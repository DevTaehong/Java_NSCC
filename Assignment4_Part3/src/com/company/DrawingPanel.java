package com.company;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingPanel extends JPanel {

    //This JPanel will serve as our drawing board, our canvas.

    //Declare a car object, with starting values
    Car myCar = new Car(Color.RED, 70, 200, 100, 80);

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);   //Tell the parent JPanel to repaint ie redraw
        //Avoids a couple of potential issues

        //Draw the vehicle on panel
        myCar.drawVehicle(g);
    }
}

