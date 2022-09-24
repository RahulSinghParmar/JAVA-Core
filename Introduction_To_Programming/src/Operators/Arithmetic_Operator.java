package Operators;

public class Arithmetic_Operator
{
    /* Arithmetic operators are used to perform arithmetic operations on variables and data.

    Operator               		Operation

        +           			Addition
        -           			Subtraction
        *                       Multiplication
        /                       Division
        %           			Modulo Operation (Remainder after division)

    */

    public static void main(String[] args)
    {
        //declare variables
        int a = 3, b = 17, c = 35, d = 55;

        System.out.println("a:" + a + " b:" + b + " c:" + c + " d:" + d );  //displaying variable data

        //add operations
        System.out.println();
        System.out.println(" ****** Addition_Operation *****");
        System.out.println("a+b: " + (a + b));  //20
        System.out.println("a+c: " + (a + c));  //38
        System.out.println("a+d: " + (a + d));  //58
        System.out.println();   //spacing

        //subtract operations
        System.out.println();
        System.out.println(" ****** Subtraction_Operation ***** ");
        System.out.println("b-a: " + (b - a));  //14
        System.out.println("c-a: " + (c - a));  //32
        System.out.println("d-a: " + (d - a));  //52
        System.out.println();

        //multiply operations
        System.out.println();
        System.out.println(" ****** Multiplication_Operation *****");
        System.out.println("a*b: " + (a * b));  //51
        System.out.println("a*c: " + (a * c));  //105
        System.out.println("a*d: " + (a * d));  //165
        System.out.println();

        //division operations
        System.out.println();
        //Note the operation, a / b in our program. The / operator is the division operator.
        System.out.println(" ****** Division_Operation *****");
        System.out.println("b/a: " + (b / a));  //5
        System.out.println("c/a: " + (c / a));  //11
        System.out.println("d/a: " + (d / a));  //18
        System.out.println();

        //modulo operations
        System.out.println();
        System.out.println(" ****** Modulo_Operation *****");
        System.out.println("d%a: " + (b % a));  //2
        System.out.println("c%a: " + (c % a));  //2
        System.out.println("b%a: " + (d % a));  //1
        //The modulo operator % computes the remainder. When b = 17 is divided by a = 3, the remainder is 2.
        System.out.println();


    }

}
