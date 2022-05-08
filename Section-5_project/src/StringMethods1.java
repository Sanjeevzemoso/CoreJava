public class StringMethods1 {
    public static void main(String[] args) {
        String name = "John baugh";
        String name2 = "John baugh";
        String name3 = "Bob";

        for ( int i = 0 ; i < name.length() ; i++) {
            System.out.print(name.charAt(i)+" ");
        }//end for

        System.out.println();

        if(name.equals(name2)) {
            System.out.println("Names are equal");
        }
        else {
            System.out.println("Names arent equal");
        }
    }//end main

}
