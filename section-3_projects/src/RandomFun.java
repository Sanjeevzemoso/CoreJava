package src;

import java.util.Random;

public class RandomFun {
    public static void main(String[] args) {

        Random random = new Random();
        int myRandomnumber;

        myRandomnumber = random.nextInt();
        System.out.println("Number is : \t "+ myRandomnumber );

        myRandomnumber = random.nextInt(1000);//0-999
        System.out.println("Number is : \t "+ myRandomnumber );

        myRandomnumber = random.nextInt(1000)+1;//1-1000
        System.out.println("Number is : \t "+ myRandomnumber );


    }//end main
}
