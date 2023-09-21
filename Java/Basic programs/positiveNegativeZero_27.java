import java.util.Scanner;

public class positiveNegativeZero_27 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num=in.nextInt();

        if(num>0){
            System.out.println("It is a Positive Number.");
        }   else if(num<0){
            System.out.println("It is a Negative Number.");
        }   else{
            System.out.println("It is Zero.");
        }

        in.close();
    }
    
}
