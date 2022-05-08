package src;

import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {

        ArrayList<Integer> myAl = new ArrayList<>();

        myAl.add(10);
        myAl.add(22);

        for ( int i = 0 ; i < myAl.size();i++) {
            System.out.println(myAl.get(i));
        }

        String pi = "3.14159";
        Double db = Double.parseDouble(pi);
        db += 4.5;

        System.out.println(db);


    }// end main
}
