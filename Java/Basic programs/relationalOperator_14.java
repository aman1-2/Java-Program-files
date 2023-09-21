public class relationalOperator_14 {
    public static void main(String[] args) {
        int num1=10,num2=15;

        /*Going to learn about various relational operators and they are just similar
        to mathematical realtional operator...
        In java the relational Operators returns either true or false as there result...*/

        //Greater than Operator (>) -> For True.
        System.out.println(num2>num1);
        //Greater than Operator (>) -> For False.
        System.out.println(num1>num2);

        //Lesser than Operator (<) -> For True.
        System.out.println(num1<num2);
        //Lesser than Operator (>) -> For False.
        System.out.println(num2<num1);

        //Greater than and Equal to Operator (>=) -> For True.
        System.out.println(num1>=10);
        System.out.println(num1>=9);
        //Greater than and Equal to Operator (>=) -> For False.
        System.out.println(num1>=11);

        //Lesser than and Equal to Operator (<=) -> For True.
        System.out.println(num1<=10);
        System.out.println(num1<=11);
        //Lesser than and Equal to Operator (>=) -> For False.
        System.out.println(num1<=9);

        //Double Equal to Operator(==) -> For Ture.
        System.out.println(num1==10);
        //Double Equal to Operator(==) -> For False.
        System.out.println(num1==9);
        /*One Thing to note for Double Equal to sign(==) and single equal to sign(=) is
        that double equal too is used to compare two values whereas single equal too
        is used to assign the value...*/

        //Not Equal too Operator(!=) -> For True.
        System.out.println(num1!=9);
        //Not Equal too Operator(!=) -> For False.
        System.out.println(num1!=9);

    }
}
