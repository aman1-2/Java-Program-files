import java.util.Scanner;

public class numberHalfPyramid_4 {
    public static void main(String[] args) {
        /*Pattern Going to form:- 
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */

        Scanner in=new Scanner(System.in);

        int rows;
        System.out.print("Enter the number of rows: ");
        rows=in.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        in.close();
    }
    
}
