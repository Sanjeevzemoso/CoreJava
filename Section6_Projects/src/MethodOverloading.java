public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(getResult(3));
        System.out.println(getResult(4,5));
        System.out.println(getresult(5,"hello"));

    }//end main

    public static int getResult( int num ) {
        return num*2;
    }

    public static int getResult(int num1 , int num2 ) {
        return num1*num2;
    }

    public static int getresult(int num1 , String value) {
        return num1+Integer.parseInt(value);
    }
}
