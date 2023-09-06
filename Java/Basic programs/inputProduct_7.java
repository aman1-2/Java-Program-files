import java.util.Scanner;
public class inputProduct_7{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);

        int num1,num2,product;
        System.out.print("Enter the first number: ");
        num1=in.nextInt();
        System.out.print("Enter the second number: ");
        num2=in.nextInt();
        product=num1*num2;
        System.out.println("Printing the num1: "+num1);
        System.out.println("Printing the num2: "+num2);
        System.out.println("Printing the product of "+num1 +"*" +num2 +"=" +product);

        in.close();
    }
}