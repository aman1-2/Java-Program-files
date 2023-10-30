import java.util.Scanner;

public class printingStarPattern_2 {
    public static void main(String[] args) {
        /*The Star pattern which we are going to print is:-
        *
        **
        ***
        ****
        *****

        Observation to be made to print the patterns:-
        (i)We must now what is number of rows in our pattern i.e the number of line to be
        printed in the pattern which we control our outer loop.
        (ii)The second is column which will ensure how many times a design we have to print 
        in each line.
        (iii)Third and last what we have to print.
         */

        Scanner in=new Scanner(System.in);

        int rows;
        System.out.print("Enter the number of Rows: ");
        rows=in.nextInt();
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        in.close();
    }
}
