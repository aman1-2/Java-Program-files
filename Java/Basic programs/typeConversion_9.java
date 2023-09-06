import java.util.Scanner;
public class typeConversion_9{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);

        /*Java allows by default type conversion of data types from smaller size data type
        to larger size data type.
        
        Byte->short->int->float->long->double
        
        Note:- Type coversion is shown under two conditions that is:-
        (i)The data type must be compartible of same category we cann't have a conversion of
        a boolean data type into int as boolean has truth values as its value whereas int has
        number as its value.
        (ii)Wheras the other condition is the coversion must be from larger data type towards the
        smaller data type. (destination type > source type)  */

        int a=4; //Int -> 4byte;
        float b=a; //so we have type converted our integer a variable value into flaoting variable b.

        //we can to go on and do this....

        double c=b; //So here we have done a type conversion of float to double data type here you can observe that type coversion is made between the smaller data type value to alrger data type values.

        /*But at this place only if we have did 
        float a=12.06;
        int b=a;
        
        It would have thrown us a message as lossy conversion as we are trying to type a larger 
        data type value into a smaller data type value which could result in the loose of data
        hence to avoid such loose java compiler doesn't do such type conversion on its owm.
        As int variable wont't be able to store the decimal part of floating value in that case
        their will be loose of data.
        
        We too call type conversion as the -> widening conversion as we are only increasig the
        size of the data type in the default type conversion. */

        System.out.println("Using the value of the variable c="+c);

        in.close();
    }
}