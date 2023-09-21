import java.util.Scanner;

public class calculator_26 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int num1=in.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2=in.nextInt();
        int res=0;

        char ch=in.nextLine().charAt(0);

        switch(ch){
            case '+': res=num1+num2;
                break;
            case '-': res=num2-num1;
                break;
            case '*': res=num1*num2;
                break;
            case '/': res=num2/num1;
                break;
            case '%': res=num2%num1;
                break;
            default:System.out.println("You have given a Wrong Operator Input");
        }

        System.out.println("Result: " + res);

        in.close();
    }
}