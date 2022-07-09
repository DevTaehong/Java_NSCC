package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] my2Array = {
                {1,2,3},
                {4,2,1},
                {5,3,7}
        };
        for (int i=0; i<3; i++) {
            for (int j=0; j < 3; j++) {
                System.out.print(my2Array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(my2Array));

    }
}
