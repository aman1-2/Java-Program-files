import java.util.Scanner;

public class passFail_24 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the marks you ahve obtained: ");
        int marks=in.nextInt();

        String str=(marks>=33)?"Pass":"Fail";

        System.out.println(str);

        in.close();
    }
    
}
