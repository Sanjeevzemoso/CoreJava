package src;

import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char grade ;

        System.out.println("Please Enter your grade");
        grade = sc.next().charAt(0);

        switch(grade) {
            case 'A' :
            case 'a' :
                System.out.println("Great job");
                break;
            case 'B' :
            case 'b' :
                System.out.println("Good Job");
                break;
            case 'F' :
                System.out.println("you are failing");
                break;
            default :
                System.out.println("Entered a invalid grade");
        }

    }//end main
}
