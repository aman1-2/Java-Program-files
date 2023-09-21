import java.util.Scanner;
public class weekNamePrinting_29 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the Week number whose Week day name you want to see: ");
        int day=in.nextInt();

        switch(day){
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
            default: System.out.println("The day number You have Entered is wrong it must be between (1-7).");
        }

        in.close();
    }
    
}
