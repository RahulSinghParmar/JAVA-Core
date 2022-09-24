package Operators;

public class logical_Operator
{
    /*
    Logical operators are used to check whether an expression is true or false. They are used in decision-making

    Operator				Example                     		Meaning

&& (Logical AND)		expression1 && expression2	    true only if both expression1 and expression2 are true

|| (Logical OR)			expression1 || expression2  	true if either expression1 or expression2 is true

! (Logical NOT)             !expression                 true if expression is false and vice versa

     */

    public static void main(String[] args)
    {
        // && operator
        System.out.println((5 > 3) && (8 > 5));  // true
        // (5 > 3) && (8 > 5) returns true because both (5 > 3) and (8 > 5) are true
        System.out.println((5 > 3) && (8 < 5));  // false
        //(5 > 3) && (8 < 5) returns false because the expression (8 < 5) is false.

        // || operator
        System.out.println((5 < 3) || (8 > 5));  // true
        //(5 < 3) || (8 > 5) returns true because the expression (8 > 5) is true.
        System.out.println((5 > 3) || (8 < 5));  // true
        //(5 > 3) || (8 < 5) returns true because the expression (5 > 3) is true.
        System.out.println((5 < 3) || (8 < 5));  // false
        //(5 < 3) || (8 < 5) returns false because both (5 < 3) and (8 < 5) are false.

        // ! operator
        System.out.println(!(5 == 3));  // true
        // !(5 == 3) returns true because 5 == 3 is false.
        System.out.println(!(5 > 3));  // false
        //!(5 > 3) returns false because 5 > 3 is true.

    }
}
