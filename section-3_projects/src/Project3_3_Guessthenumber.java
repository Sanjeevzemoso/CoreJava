package src;

import java.util.Random;
import java.util.Scanner;

public class Project3_3_Guessthenumber {
    public static void main(String[] args) {
        int ourGuess;
        int computerNumber;
        int guessCount=0;

        Scanner sc = new Scanner(System.in);
        boolean guessedNumber = false;

        Random r = new Random();
        computerNumber = r.nextInt(100)+1;

        while(!guessedNumber) {
            System.out.println("Enter your guess");
            ourGuess = sc.nextInt();
            guessCount++;
            if( ourGuess >= 1 && ourGuess <= 100 ) {
                if (ourGuess == computerNumber) {
                    System.out.println("Congratulations you ahve guessed the number correctly guess count is "+guessCount);
                    guessedNumber = true;
                } else if (ourGuess > computerNumber) {
                    System.out.println("Guess is too high");
                } else if (ourGuess < computerNumber) {
                    System.out.println("Guess is too low");
                }
            }
            else {
                System.out.println("That was wasted guess , pick between 1 to 100");
            }
        }//end while
    }//end main
}
