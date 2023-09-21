import java.util.Scanner;

public class ternary_23 {
    public static void main(String[] args) {
        /*The Ternary Operator is just like if-else condition statement where we
         * don't have to differensiate it into if and else block instead we can combine it
         * in too one single statement
         * Here we can combine all the condition true statement and false statement.
         * 
         * SYNTAX -> variable=(condition)?(true Statement):(false Statement);
         * We store the value of ternary Operator in a variable to use its value later on...
         */

        Scanner in=new Scanner(System.in);

        int num=in.nextInt();

        String str=((num%2)==0)?"even":"odd";

        System.out.println(str);

        in.close();
    }
}