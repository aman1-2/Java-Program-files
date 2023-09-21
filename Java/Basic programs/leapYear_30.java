import java.util.Scanner;
public class leapYear_30 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the Year: ");
        int year=in.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("The Year is leap Year.");
                }  
            }
        }   else{
            System.out.println("This is not a leap Year.");
        }

        in.close();
    }
}
