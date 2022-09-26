package Operators.Unary_Operators;

public class Unary_Operator
{
    /*
    Java Unary Operators

    Unary operators are used with only one operand. For example, ++ is a unary operator that increases the value of a variable by 1.
    That is, ++5 will return 6.

    Different types of unary operators are:

    Operator        Meaning
        +			Unary plus: not necessary to use since numbers are positive without using it
        -			Unary minus: inverts the sign of an expression
        ++			Increment operator: increments value by 1
        --			Decrement operator: decrements value by 1
        !			Logical complement operator: inverts the value of a boolean

    Increment and Decrement Operators
    */

    public static void main(String[] args)
    {
        /*
        Java also provides increment and decrement operators: ++ and -- respectively.
        ++ increases the value of the operand by 1, while -- decrease it by 1. For example,
        */

        int num = 5;

        // increase num by 1
        ++num;
        System.out.println("num : " + num);

        // Here, the value of num gets increased to 6 from its initial value of 5


    }






}
