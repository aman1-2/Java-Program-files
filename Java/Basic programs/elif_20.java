import java.util.Scanner;

public class elif_20 {
    public static void main(String[] args) {
        /*The else if is the part of if-else when we have to check the condition in our else 
         * part of the statement.
        */

        //Print Adult if above 18.
        //Print Teenager if between 13 and 18.
        //Print Child if below it.

        Scanner in=new Scanner(System.in);

        int age=in.nextInt();

        if(age>=18){
            System.out.println("You are Adult.");
        } else if(age>13 && age<18){
            System.out.println("You are Teenager.");
        } else{
            System.out.println("You are still a child.");
        }

        in.close();
    }
    
}
