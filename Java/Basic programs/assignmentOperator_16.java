public class assignmentOperator_16 {
    public static void main(String[] args) {
        /*Trying to show you how we can assign values to the variable
         * (i) =
         * (ii) +=
         * (iii) -=
         * (iv) *=
         * (v) %=    */

        int num=10,num1=10,num2=10,a=5; //Assignment Opearator;
        System.out.println("Assigning with the help of '=' to Opeartor: " + num);

        num1 += num;  // += Operator
        System.out.println("Assigning with the help of '+=' to Opeartor: " + num1);

        num2 -= num1; // -= Operator
        System.out.println("Assigning with the help of '-=' to Opeartor: " + num2);

        num2 /= num; // /= Opeartor
        System.out.println("Assigning with the help of '/=' to Opeartor: " + num2);

        num2 %= num; // %= Operator
        System.out.println("Assigning with the help of '%=' to Operator: " + num2);

        a *= 5; // *= Operator
        System.out.println("Assigning with the help of '*=' to Operator: " + a);

    }
}
