package Operators.Relational_Operator;

public class Relational
{
    /*
    Relational operators are used to check the relationship between two operands
    check if a is less than b

    a < b;

    Here, < operator is the relational operator. It checks if a is less than b or not.
    It returns either true or false

    Operator        Description                 Example

	==				Is Equal To	        		3 == 5 returns false
    !=			    Not Equal To		        3 != 5 returns true
	>				Greater Than		        3 > 5 returns false
    <				Less Than			        3 < 5 returns true
    >=				Greater Than or Equal To	3 >= 5 returns false
	<=				Less Than or Equal To		3 <= 5 returns true

     */

    public static void main(String[] args)
    {
        //creat a and b variables
        int a = 3;
        int b = 5;

        //displaying current value of a and b variables
        System.out.println("a is " + a + " and b is " + b);

        // == operator
        System.out.print("a == b ");
        System.out.println(a == b); //false

        //!= operator
        System.out.print("a != b ");
        System.out.println(a!= b); //true

        //> operator
        System.out.print("a > b ");
        System.out.println(a > b); //false

        //< operator
        System.out.print("a < b ");
        System.out.println(a < b); //true

        //>= operator
        System.out.print("a >= b ");
        System.out.println(a >= b); //true

        //<= operator
        System.out.print("a <= b ");
        System.out.println(a <= b); //false


    }

}
