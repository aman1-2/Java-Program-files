import java.util.Scanner;
public class numberOddEven_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num=in.nextInt();

        if(num%2==0){
            System.out.println(num + " is an even number.");
        } else{
            System.out.println(num + " is an odd number.");
        }

        in.close();
    }
}
