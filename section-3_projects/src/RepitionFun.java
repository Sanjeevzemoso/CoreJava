package src;

public class RepitionFun {
    public static void main(String[] args) {
        int count = 15;

        while(count<10) {
            System.out.println(count);
            count++;
        }

        do {
            System.out.println(count);
            count++;
        }
        while(count < 15 );
    }
}
