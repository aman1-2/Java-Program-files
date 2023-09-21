import java.util.Scanner;

public class switchStatement_25 {
    /*Switch Statement -> In switch statement we basically have mutliple choices for our
     * condition the one that matches the condition that case will run.
     * Wheras the Default Statement given in the program is to break out from the switch case
     * once we have hitted any of our case or we have just reached the default statement.
    */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter a Character for the Switch Statement: ");
        char ch=in.nextLine().charAt(0);

        switch(ch){
            case 'a':System.out.println("Aman");;
                break;

            case 's':System.out.println("Suman");;
                break;

            case 'r':System.out.println("Ranvijay");;
                break;

            case 'm':System.out.println("Money");;
                break;
            default:System.out.println("Love");

            in.close();
        }

    }
}