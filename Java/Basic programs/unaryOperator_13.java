import java.util.Scanner;
public class unaryOperator_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1,num2;

        num1=in.nextInt();
        num2=in.nextInt();

        /*Going to use Unary operator One thing to note for unary Operator are that the 
        requires only operand to shoe thier operations...
        We have two types of Unary Operators as:-
        (i)Increment        (ii)Decrement
        
        In Increment and Decrement Operator we have futher classification as Pre and post*/


        /*Lets start with Pre-increment (++operand) in this we firstly increment the value
        and then use it....*/
        System.out.println("Pre-Increment: "+ ++num1);

        /*Now Coming towards Post-Increment (operand++) in this we use the value first and
        then increment it....*/
        System.out.println("Post-Increment: "+ num1++);
        System.out.println("Trying to print the Value after Post-Increment: "+ num1);


        /*About Pre-Decrement (--operand) in this we have to dcerement the value first and then
        use it.....*/
        System.out.println("Pre-Decrement: "+ --num2);

        /*Post-Decrement (operand--) in this we have to use the value first and then decrement it...*/
        System.out.println("Post-Decrement: "+ num2--);
        System.out.println("Trying to print the Value after Post-Decrement: "+ num2);

        in.close();
    }
}
