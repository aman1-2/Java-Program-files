public class nestedLoop_1{
    public static void main(String[] args){
        /*When we try to give a Looping statement inside another Looping Statement then
         * we call it a Nested Looping statement similar to what we do in conditional statement 
         * where we give a if condition inside an another if condition.
         */

        /*Try to print the Hello Aman Aman Aman with the help of looping statement.We will
         * try to Print it in some what this pattern.
         * Hello Aman Aman Aman
         * Hello Aman Aman Aman
         * Hello Aman Aman Aman
         * Hello Aman Aman Aman
        */

        for(int i=1;i<=4;i++){
            System.out.print("Hello ");
            for(int j=1;j<=3;j++){
                System.out.print("Aman ");
            }
            System.out.println();
        }
    }
}