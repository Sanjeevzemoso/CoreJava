package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_Arralylist {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Double input = 0.0;

        System.out.println("Please enter the number : \t");
        input = sc.nextDouble();

        while (input >= 0.0) {
            myList.add(input);
            System.out.print("Please enter the number : \t");
            input = sc.nextDouble();

        }

        for (int i = myList.size()-1; i >= 0; i--) {
            System.out.println(myList.get(i));
        }
    }
}
