/*WAP to calculate the area of circle by user given entry?*/

import java.util.Scanner;
public class areaOfCircle_8{
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);

        float area,radius,pi=3.147f;
        System.out.print("Enter the radius of circle: ");
        radius=input.nextFloat();
        System.out.println("Formula for calculating the area of circle is: pi*radius*radius");
        area=pi*radius*radius;
        System.out.println(pi+"*"+radius+"*"+radius+"="+area);

        input.close();
    }
}