public class Methodcalls {
    public static void main(String[] args) {
        doSomething();
    }// end main


    public static void doSomething(){
        System.out.println("In something");

        int result = getSomeValue();

        System.out.println("result :\t"+result);
    }
    public static int getSomeValue() {
        return 150;
    }
}
