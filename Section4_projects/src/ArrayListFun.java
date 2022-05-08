package src;

import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {

        ArrayList<String> namesList = new ArrayList<>();

        namesList.add("john");
        namesList.add("Kyle");
        namesList.add("Mattew");
        namesList.add("amanda");

        for(int i =0 ; i < namesList.size() ; i++ ) {
            System.out.println(namesList.get(i));
        }

    }
}
