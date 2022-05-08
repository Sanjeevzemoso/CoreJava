import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an adjective : \t");
        String ADJECTIVE1 = sc.nextLine();
        System.out.print("Enter a girl's name : \t");
        String GIRLS_NAME = sc.nextLine();
        System.out.println("Enter another adjective : ");
        String ADJECTIVE2 = sc.nextLine();
        System.out.println("Enter an occupation ");
        String OCCUPATION1 = sc.nextLine();
        System.out.println("Enter the name of a place");
        String PLACE = sc.nextLine();
        System.out.println("Enter the name of a piece of clothing : ");
        String CLOTHING = sc.nextLine();
        System.out.println("Enter the mane of hobby : ");
        String HOBBY = sc.nextLine();
        System.out.println("Enter another Adjective : ");
        String ADJECTIVE3 = sc.nextLine();
        System.out.println("Enter another occupation : ");
        String OCCUPATION2 = sc.nextLine();
        System.out.println("Enter a boy's name : ");
        String BOYS_NAME = sc.nextLine();
        System.out.println("Enter a man's name :  ");
        String MANS_NAME = sc.nextLine();


        System.out.println("The once was a "+ADJECTIVE1 +"girl named " + GIRLS_NAME + ",Who was a "+
                ADJECTIVE2+" "+OCCUPATION1+" in the kingdom of "+PLACE+".");

        System.out.println(" She loved to wear "+CLOTHING+
                " and to "+HOBBY+"."+" She wanted to marry the "+ADJECTIVE3+" "+OCCUPATION2+" named "+BOYS_NAME+
                " but her father,King "+MANS_NAME+" forbid her from seeing him.");


    }
}
