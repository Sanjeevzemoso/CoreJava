package src;

import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        int[] Array = new int[5];
        Scanner s = new Scanner(System.in);

        for ( int j=0 ; j < Array.length ; j++ ) {
            System.out.print("Enter an integer : \t");
            Array[j] = s.nextInt();
        }
        for ( int i : Array ) {
            System.out.println(i*2);
        }
    }
}
