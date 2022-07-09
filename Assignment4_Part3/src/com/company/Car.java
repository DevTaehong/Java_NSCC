package com.company;

import java.awt.Color;
import java.awt.Graphics;

public class Car extends Vehicle {

    //Constructor
    public Car(Color color, int height, int width, int xPosition, int yPosition)
    {
        //Assign param values to properties of the object (calls super's get/set methods)
        this.setVehicleColor(color);
        this.setHeight(height);
        this.setWidth(width);
        this.setxPosition(xPosition);
        this.setyPosition(yPosition);
    }

    //Implement the inherited drawVehicle method
    @Override
    public void drawVehicle(Graphics g) {

        //Get the main car color from parent
        Color mainColor = this.getVehicleColor();

        //First draw the car body (rectangle)
        g.setColor(mainColor);
        g.fillRect(this.getxPosition(), this.getyPosition(), this.getWidth(), this.getHeight());

        //Figure out wheel size and position in relation to car body
        int wheelSize = this.getWidth()/4;     //Wheel is quarter of width
        int leftWheelX = this.getxPosition() + (this.getWidth()/8); //Wheel starts at 1/8th of body length
        int wheelY = this.getyPosition() + (this.getHeight() - (wheelSize /2));

        //Draw first wheel, a filled circle (oval)
        g.setColor(Color.BLACK);   //Set wheel color to black
        g.fillOval(leftWheelX, wheelY, wheelSize, wheelSize);

        //Figure out position of right wheel - half the length of the car from the left wheel position
        int rightWheelX = leftWheelX + (this.getWidth()/2);

        //Draw second wheel
        g.fillOval(rightWheelX, wheelY, wheelSize, wheelSize);

        //Draw roof (a non-filled rectangle)
        g.setColor(mainColor);
        //Half the total car width and height.
        //X position is centre of left wheel
        //Get Y position by subtracting half the height of the car body
        g.drawRect(leftWheelX + wheelSize / 2,this.getyPosition() - this.getHeight() /2, this.getWidth()/2, this.getHeight()/2);

        // Draw the "windows" separator
        g.setColor(Color.BLACK);
        //X1 and X2 are main car's X + half the width of car (to get centre)
        //Y1 is top of roof (main car Y subtract half height of car)
        //Y2 is top of main car
        g.drawLine(this.getxPosition() + this.getWidth()/2, this.getyPosition() - this.getHeight() / 2, this.getxPosition() + this.getWidth()/2, this.getyPosition());
    }
}

