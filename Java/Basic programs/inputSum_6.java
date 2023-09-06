/*WAP to print the sum of the two numbers and the numbers are inputted with the user?*/
import java.util.Scanner;
public class inputSum_6{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);

        int num1,num2,sum;
        System.out.print("Enter the first number: ");
        num1=in.nextInt();
        System.out.print("Enter the second number: ");
        num2=in.nextInt();
        sum=num1+num2;
        System.out.println("Printing the num1: "+num1);
        System.out.println("Printing the num2: "+num2);
        System.out.println("Printing the sum: "+sum);

        in.close();
    }
}