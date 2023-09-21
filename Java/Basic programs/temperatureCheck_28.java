import java.util.Scanner;

public class temperatureCheck_28 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.print("Enter your Body Temperature: ");
        float tempr=in.nextFloat();

        if(tempr>=100){
            System.out.println("You have Fever and Need to go to Doctor.");
        }   else{
            System.out.println("Have Fun and Enjoy Because you don't have Fever.");
        }

        in.close();
    }
}
