package Operators;

public class Assignment_Operator
{
    /*
    Assignment operators are used in Java to assign values to variables. For example,

    int age;
    age = 5;

    Here, = is the assignment operator. It assigns the value on its right to the variable on its left. That is, 5 is assigned to the variable age.
    Let's see some more assignment operators available in Java.

    Operator            Example          Equivalent to
    =                   a = b;              a = b;
    +=                  a += b;             a = a + b;
    -=                  a -= b;             a = a - b;
    *=                  a *= b;             a = a * b;
    /=                  a /= b;             a = a / b;
    %=                  a %= b;             a = a % b;
    &=                  a &= b;             a = a & b;
    |=                  a |= b;             a = a | b;
    ^=                  a ^= b;             a = a ^ b;
    <<=                 a <<= b;            a = a << b;
    >>=                 a >>= b;            a = a >> b;

    */

    public static void main(String[] args)
    {
        // creating variable
        int b = 10;
        //int b = 5;
        int a;

        //assign value using =
        a = b;    //a= 10
        System.out.println("Variable using a = " + a);  //10

        //assign value using +=
        a += b;   //a = 10
        System.out.println("Variable using a += " + a); //20

        //assign value using -=
        a -= b;   //a = 20
        System.out.println("Variable using a -= " + a); //10

        //assign value using *=
        a *= b;   //a = 10
        System.out.println("Variable using a *= " + a); //100

        //assign value using /=
        a /= b;   //a = 100
        System.out.println("Variable using a /= " + a);   //10

        //assign value using %=
        a %= b;   //a = 10
        System.out.println("Variable using a %= " + a); //0

        //assign value using &=
        //a &= b;   //var1 = false
        //System.out.println("Variable using a &= " + a);







    }
}
