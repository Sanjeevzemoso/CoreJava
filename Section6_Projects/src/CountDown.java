public class CountDown {
    public static void main(String[] args) {
        CountDownFrom(10);
    }//end main

    public static void CountDownFrom( int num ) {
        if( num >= 0 ) {
            System.out.println(num);
            CountDownFrom(num-1);
        }
    }
}
