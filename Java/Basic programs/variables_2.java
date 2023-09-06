public class variables_2{
    public static void main(String args[]){
        int var=20; //Created a variables with the name.
        /*A variable is a name value used to store and process the value during the program
        execution..*/

        //We can to create variables with different data types.While creating a variable its important to tell the type of variable...
        float a=12.06f;
        /*We should always write 'f' at the end of the floating value as java by default consider
        every floating(decimal) value as Double.Because of which even if we create a float value
        it takes the value as double if 'f' not mentioned...*/

        String str="Aman Pratap Singh";

        char ch='A';

        byte b=120;

        /*Then we have data types as ->long ->short ->double... */

        System.out.println("Printing the vlaue of the variables which we have created are as follow:-");
        System.out.println("var="+var+"\n"+"a="+a+"\n"+"str="+str+"\n"+"ch="+ch+"\n"+"b="+b);

        // System.out.println("Printig the type of the varibles:-");
        // System.out.println("var="+typeof(var)+"\n"+"a="+typeof(a)+"\n"+"str="+typeof(str)+"\n"+"ch="+typeof(ch)+"\n"+"b="+typeof(b));
    }
}