public class MethodsDemo {
    public static void main(String[] args) {
        printhello();
        printparmeter(10);
        int res = giveme10();
        int res1 = addThese(10,20);
        System.out.println(res);
        System.out.println(res1);
    }//emd main

    //void parameterless method
    public static void printhello() {
        System.out.println("Hello");
    }

    //void parameterised method
    public static void printparmeter(int a ) {
        System.out.println("the number is "+a);
    }

    public static int giveme10() {
        return 10;
    }

    public static int addThese(int num1 , int num2 ) {
        return num1 + num2 ;
    }
}
