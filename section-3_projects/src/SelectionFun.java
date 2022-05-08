package src;


import java.util.Scanner;

public class SelectionFun {
    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the pub and Grille : ");

        System.out.println("please Enter your age");
        age = sc.nextInt();

        if(age >= 21 ) {
            System.out.println("Here , have a beer ");

        }
        else if ( age >=16 ) {
            System.out.println("Here have a coke");
            System.out.println("Atleast you can drive");
        }
        else {
            System.out.println("Here , have a coke ");
        }

        System.out.println("Thanks for coming to the pub");
    }
}
