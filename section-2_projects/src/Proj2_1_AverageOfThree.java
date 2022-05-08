import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.nextLine();

        double avg = (a+b+c) / 3.0 ;

        System.out.println("The average of three numbers is "+avg);

    }
}
