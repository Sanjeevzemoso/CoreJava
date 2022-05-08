package src;

public class ArrayFun {
    public static void main(String[] args) {
        int[] myArray ;
        myArray = new int[5];

        myArray[0]=10;
        myArray[1]=5;
        myArray[2]=34;
        myArray[3]=45;
        myArray[4]=20;

//        for ( int i = 0; i < myArray.length ; i++ ) {
//            System.out.println(myArray[i]);
//        }

        for ( int num : myArray ) {
            System.out.println(num);
        }
    }// end main
}
