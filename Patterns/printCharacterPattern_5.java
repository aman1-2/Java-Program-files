import java.util.Scanner;

public class printCharacterPattern_5 {
    public static void main(String[] args) {
        /*Pattern Going to Print:-
        A
        B C
        D E F
        G H I J
        K L M N O
        */

        Scanner in=new Scanner(System.in);

        int rows;
        System.out.print("Enter the number of Rows: ");
        rows=in.nextInt();

        char ch='A'; //Made a Character variable which we want to print in our Pattern and 
        //we will be upadating its value as going Forward.
        //We can too Create it with the help of Ascii value.

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if(ch=='Z'){
                    System.out.print(ch+" ");
                    ch='A';
                }
                else{
                    System.out.print(ch+" ");
                    ch++;
                }
            }
            System.out.println();
        }

        in.close();
    }
}
