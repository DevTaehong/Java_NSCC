package com.company;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Vehicle {

    private Color vehicleColor;

    private int height;       //Height of car body
    private int width;    //Width of car body

    private int xPosition; //Current X position of top left of car
    private int yPosition; //Current Y position of top left of car

    //Abstract method to draw a vehicle, pass graphics object for drawing
    public abstract void drawVehicle(Graphics g);

    //Getters & Setters
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getxPosition() {
        return xPosition;
    }
    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }
    public int getyPosition() {
        return yPosition;
    }
    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
    public Color getVehicleColor() {
        return vehicleColor;
    }
    public void setVehicleColor(Color vehicleColor) {
        this.vehicleColor = vehicleColor;
    }
}

