import java.util.*;
public class arithmeticOperator_12{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int num1,num2;
        num1=in.nextInt();
        num2=in.nextInt();

        /*Showing the Operations for Arithmetic Operator.Arithmetic operator requires two
        operands to perform the operation....*/
        
        System.out.println("Addition: "+(num1+num2));
        System.out.println("Subtraction: "+(num1-num2));
        System.out.println("Multiplication: "+(num1*num2));
        System.out.println("Division: "+(num1/num2));
        System.out.println("Modulo(Remainder): "+(num1%num2));
        System.out.println("Increment(incrementing num1): " + ++num1);
        System.out.println("Decrement:(derementing num2) " + --num2);

        in.close();
    }
}