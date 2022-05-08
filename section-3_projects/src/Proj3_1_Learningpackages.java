package src;

import java.util.Scanner;

public class Proj3_1_Learningpackages {
    public static void main(String[] args) {
        int pack;
        int acourse;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the pack");
        pack = sc.nextInt();

        System.out.println("Please select the total courses enrolled");
        acourse = sc.nextInt();


        switch (pack) {
            case 1 :
                System.out.println("Selected package is 1");
                if( acourse <= 2 ) {
                    System.out.println("The charge is $10");
                }
                else if ( acourse > 2 ) {
                    int chr = 10+ ((acourse-2)*6);
                    System.out.println("The charge is "+ chr);
                }
                else {
                    System.out.println("Please select correct A charge");
                }
                break;
            case 2 :
                System.out.println("Selected package is 2");
                if( acourse <= 4) {
                    System.out.println("The charge is $12");
                }
                else if ( acourse > 4 ) {
                    int chr = 12 + ((acourse-4)*4);
                    System.out.println("The charge is "+ chr);
                }
                else {
                    System.out.println("Please select correct A charge");
                }
                break;
            case 3 :
                System.out.println("Selected package is 3");
                if( acourse <= 6 ) {
                    System.out.println("The charge is $15");
                }
                else if ( acourse > 6 ) {
                    int chr = 15+((acourse-6)*3);
                    System.out.println("The charge is "+ chr);
                }
                else {
                    System.out.println("Please select correct A charge");
                }
                break;
            default:
                System.out.println("Please select correct package");
        }


    }
}
