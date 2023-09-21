import java.util.Scanner;

public class largestOfThree_22 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int num1=in.nextInt(),num2=in.nextInt(),num3=in.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println(num1 + " is the largest number.");
        } else if(num2>num3){
            System.out.println(num2 + " is the largest number.");
        } else{
            System.out.println(num3 + " is the largest number.");
        }

        in.close();
    }
    
}
