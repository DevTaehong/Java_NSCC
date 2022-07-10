package com.company;

public class Summation {
    private int sumRow1;
    private int sumRow2;
    private int sumRow3;

    public Summation (int sumRow1, int sumRow2, int sumRow3) {
        this.sumRow1 = sumRow1;
        this.sumRow2 = sumRow2;
        this.sumRow3 = sumRow3;
    }

    public String rowOfSum()
    {
        String eachRowSum = String.format("\nThe summation of Row # 1 is : %d\nThe summation of Row # 2 is : %d\n" +
                "The summation of Row # 3 is : %d", this.sumRow1, this.sumRow2, this.sumRow3);
        return eachRowSum;
    }











}
