package src;

import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        String[] myArray = new String[5];
        int[] myArray1 = new int[5];
        Scanner sc = new Scanner(System.in);

        for ( int i=0 ; i < myArray.length ; i++ ) {
            System.out.println("Please enter names : \t");
            myArray[i] = sc.nextLine();

        }

        for ( int i=0 ; i < myArray1.length ; i++ ) {
            System.out.println("Please enter the ages : \t");
            myArray1[i] = sc.nextInt();
        }

        for (  int i=0; i < myArray.length ; i++ ) {
            System.out.println(myArray[i]+" is "+myArray1[i]+" years old ");

        }
    }
}
