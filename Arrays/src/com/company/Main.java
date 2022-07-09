package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myArray={5,6,8,9,7,4,5};
        int max=myArray[0]; //0 is the first element in the array

        for (int i=0;i< myArray.length;i++){
            System.out.println(myArray[i]);
            if (max<=myArray[i])
                max = myArray[i];
        }
        System.out.println("The Maximum number is : " + max);

////////////////////////////////////////////////////////////////////

        Scanner sc = new Scanner(System.in);
        int[] myArray2 = new int[5];

        for (int i=0; i< myArray2.length;i++){
            System.out.println("Enter element number "+i+": ");
            myArray[i]=sc.nextInt();
        }

        for (int i=0; i< myArray2.length;i++){
            System.out.print("Printing element number "+i+": ");
            System.out.println(myArray[i]);

        }
    }
}
