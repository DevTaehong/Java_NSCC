package ca.nscc.Classes;

public class ShapeColor {

    private String colorName;
    private int rValue;
    private int gValue;
    private int bValue;

    public ShapeColor(String colorName, int rValue, int gValue, int bValue) {
        this.colorName = colorName;
        this.rValue = rValue;
        this.gValue = gValue;
        this.bValue = bValue;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public int getrValue() {
        return rValue;
    }

    public void setrValue(int rValue) {
        this.rValue = rValue;
    }

    public int getgValue() {
        return gValue;
    }

    public void setgValue(int gValue) {
        this.gValue = gValue;
    }

    public int getbValue() {
        return bValue;
    }

    public void setbValue(int bValue) {
        this.bValue = bValue;
    }
}
