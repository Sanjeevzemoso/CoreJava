import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder[] names = new StringBuilder[5];
        String[] firstn = new String[names.length];
        String[] lastn = new String[names.length];

        for ( int i = 0; i < 5 ; i++ ) {
            System.out.println("Enter the name "+i);
            StringBuilder name = new StringBuilder(sc.nextLine());
            names[i] = name ;

        }

        for( int i=0; i<names.length ; i++) {
            int spidx = names[i].indexOf(" ");
            firstn[i] = names[i].substring(0,spidx);
            lastn[i] = names[i].substring(spidx+1);
        }

        for ( String X : firstn ) {
            System.out.println(X);
        }

        for ( String Y : lastn ) {
            System.out.println(Y);
        }

        for ( int i =0 ; i<firstn.length ; i++ ) {
            for ( int j=0 ; j<lastn.length ; j++ ) {
                System.out.println(firstn[i]+" "+lastn[j]);
            }
        }
    }
}
