package com.company;

public class Marks {
    private double totalMarks;
    private double average;
    private double maxValue;
    private double minValue;

    public Marks (double tMarks, double average, double maxValue, double minValue){
        this.totalMarks = tMarks;
        this.average = average;
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    public String totalMarks()
    {
        String total = String.format("Final Report:\nThe Total Marks: %.1f\nThe Average : %.1f\nThe Maximum Value : %.1f\nThe Minimum Value :%.1f",
                this.totalMarks, this.average, this.maxValue, this.minValue);
        return total;
    }






}
