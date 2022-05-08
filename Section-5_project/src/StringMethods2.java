public class StringMethods2 {
    public static void main(String[] args) {
        String myName = "John Baugh";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereisB = myName.indexOf("B");

        String lastname = myName.substring(5);

        System.out.println(upper);
        System.out.println(lower);
        System.out.println(whereisB);
        System.out.println(lastname);
    }//emd main
}
