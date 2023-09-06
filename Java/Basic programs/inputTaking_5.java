import java.util.*; //This line has imported all the packages of util class we can to import specifically the Scanner package in our file.

/*Notation to import Only Scanner package in outr program frim teh util class.IS ->

import java.util.Scanner */

public class inputTaking_5{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num;
        System.out.print("User enterd number: ");
        num = in.nextInt();
        System.out.println("Printing the number entered by user: " + num);

        in.close();
    }
}