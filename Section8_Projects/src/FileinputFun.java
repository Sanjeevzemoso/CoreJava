import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileinputFun {
    public static void main(String[] args) {
        Scanner infile;

        try {
            infile = new Scanner(new File("/home/sanjB/IdeaProjects/Section8_Projects/input.txt"));
            int input;

            while(infile.hasNext()) {
                input = infile.nextInt();
                System.out.println(input);
            }
            infile.close();

            PrintWriter pw = new PrintWriter("/home/sanjB/IdeaProjects/Section8_Projects/input2.txt") ;
            pw.println("hello this is program writing");
            pw.close();        }
        catch(FileNotFoundException e ) {
            System.out.println(e.getMessage());
        }

    }
}
