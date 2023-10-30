import java.util.Scanner;

public class printingInvertedStarPattern_3 {
    public static void main(String[] args) {
        /*The Inverted Star which we are going to print is:-
        * * * * *
        * * * *
        * * *
        * *
        *

        Always rember these three things:-
        (i)Rows
        (ii)Columns
        (iii)What to print
         */

        Scanner in=new Scanner(System.in);

        int rows;
        System.out.print("Enter the number of rows: ");
        rows=in.nextInt();

        for(int i=1;i<=rows;i++){
            /*Here we are using a condition (rows-i-1) that will actually give how many
             * starts we have to print in that line.
             * And the actual number of Star getting Printed in each line is:-
             * 1st line -> 5
             * 2nd line -> 4
             * 3rd line -> 3
             * 4th line -> 2
             * 5th line -> 1
             */
            for(int j=1;j<=(rows-i+1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        in.close();
    }
}