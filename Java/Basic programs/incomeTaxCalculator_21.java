import java.util.Scanner;

public class incomeTaxCalculator_21 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int income=in.nextInt(),tax;


        if(income<500000){
            tax=0;
            System.out.println("For the Income "+ income+" tax which you have to pay is: "+tax);
        } else if(income>500000){
            tax=(int)(income*0.2);
            System.out.println("For the Income "+ income+" tax which you have to pay is: "+tax);
        } else{
            tax=(int)(income*0.3);
            System.out.println("For the Income "+ income+" tax which you have to pay is: "+tax);
        }

        in.close();
    }
    
}
