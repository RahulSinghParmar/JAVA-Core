package Operators;

public class Ternary_Operator
{
    /*
    Java Ternary Operator / Conditional Operators
    The ternary operator (conditional operator) is shorthand for the if-then-else statement. For example,

    variable = Expression ? expression1 : expression2

    If the Expression is true, expression1 is assigned to the variable.
    If the Expression is false, expression2 is assigned to the variable
     */
    public static void main (String[] args)
    {
        int febDays = 29;
        String result;

        // ternary operator
        result = (febDays == 25) ? "It is a leap year " : "Not a leap year.";
        System.out.println(result); //print Not a leap year

        String result1;
        result1 = (febDays == 29) ? "It is a leap year " : "Not a leap year.";
        System.out.println(result1); //print It is a leap year
    }
}
