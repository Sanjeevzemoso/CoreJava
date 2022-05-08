public class RelationalFun {
    public static void main(String[] args) {
        boolean mybool = true;
        boolean yourbool = false;

        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;

        System.out.println("my Bool is "+mybool);
        System.out.println("yourBool is"+yourbool);

        //relational operations
        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAge?"+ageComparison);

        ageComparison = yourAge > bobsAge;
        System.out.println("yourAge > bobsAge ?"+ageComparison);



    }
}
