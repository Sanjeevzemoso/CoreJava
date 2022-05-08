import java.util.ArrayList;

public class Proj6_1_SumofElements {
    public static void main(String[] args) {
        ArrayList<Integer>  somelist = new ArrayList<>(); 
        somelist.add(22);
        somelist.add(55);
        somelist.add(121);

        int sum = sumelements(somelist);
        System.out.println("Sum is "+sum);
    }//end main

    public static int sumelements(ArrayList<Integer> list){

            int sum = 0;

            for( int i = 0 ; i< list.size() ; i++ ) {
                sum += list.get(i);
            }

            return sum;
    }
}
