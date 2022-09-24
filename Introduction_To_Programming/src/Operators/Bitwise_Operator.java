package Operators;

public class Bitwise_Operator
{
    /*
    Bitwise Operators: These operators are used to perform the manipulation of individual bits of a number.
    They can be used with any of the integer types.
    They are used when performing update and query operations of the Binary indexed trees.

    &, Bitwise AND operator: returns bit by bit AND of input values.
    |, Bitwise OR operator: returns bit by bit OR of input values.
    ^, Bitwise XOR operator: returns bit-by-bit XOR of input values.
    ~, Bitwise Complement Operator: This is a unary operator which returns the one’s complement representation of the input value, i.e., with all bits inverted

     */

    public static void main(String[] args)
    {
        int a = 12 , b = 25;
        System.out.println("val of a: "+ a + "\n" + "val of b: " + b);   // display current value of a and b.
        System.out.println();   // leave blank line in console output

        /*
        1. Java Bitwise OR Operator
        The bitwise OR | operator returns 1 if at least one of the operands is 1. Otherwise, it returns 0.
        */
        int res;
        res = a | b;
        //// bitwise OR between 12 and 25
        System.out.println("a | b  : " + res);    //29
        /*
        12 = 00001100 (In Binary)
        25 = 00011001 (In Binary)

        Bitwise OR Operation of 12 and 25
         00001100
       | 00011001
       ____________
         00011101 = 29 (In Decimal)
         */


        /*
        2. Java Bitwise AND Operators
        The bitwise AND & operator returns 1 if and only if both the operands are 1. Otherwise, it returns 0
         */
        int res1;
        res1 = a & b;
        // bitwise AND between 12 and 25
        System.out.println("a & b  : " + res1);   //8
        /*
        12 = 00001100 (In Binary)
        25 = 00011001 (In Binary)

       Bitwise AND Operation of 12 and 25
          00001100
        & 00011001
       ____________
          00001000 = 8 (In Decimal)
        */


        /*
        3. Java Bitwise XOR Operator

        The bitwise XOR ^ operator returns 1 if and only if one of the operands is 1. However,
        if both the operands are 0 or if both are 1,
        then the result is 0
         */
        int res2;
        res2 = a ^ b;
        // bitwise XOR between 12 and 25
        System.out.println("a ^ b  : " + res2);   //21

        /*
        Let's look at the bitwise XOR operation of two integers 12 and 25.

        12 = 00001100 (In Binary)
        25 = 00011001 (In Binary)

        Bitwise XOR Operation of 12 and 25
            00001100
          ^ 00011001
         ____________
            00010101 = 21 (In Decimal)
        */


        /*
        4. Java Bitwise Complement Operator
        The bitwise complement operator is a unary operator (works with only one operand). It is denoted by ~
        It changes binary digits 1 to 0 and 0 to 1.
         */
        int num = 35, result;
        //bitwise complement of 35
        result = ~num;
        System.out.println("~ num  : " + result);
        /*
        It is important to note that the bitwise complement of any integer N is equal to - (N + 1). For example,
        Consider an integer 35. As per the rule, the bitwise complement of 35 should be -(35 + 1) = -36.

        35 = 00100011 (In Binary)
        // using bitwise complement operator
        ~ 00100011
        __________
          11011100
        In the above example, we get that the bitwise complement of 00100011 (35) is 11011100. Here, if we convert the result into decimal we get 220.
        However, it is important to note that we cannot directly convert the result into decimal and get the desired output.
        This is because the binary result 11011100 is also equivalent to -36.
        To understand this we first need to calculate the binary output of -36.

        2's Complement
        In binary arithmetic, we can calculate the binary negative of an integer using 2's complement.
        1's complement changes 0 to 1 and 1 to 0. And, if we add 1 to the result of the 1's complement,
        we get the 2's complement of the original number. For example,

        // compute the 2's complement of 36
        36 = 00100100 (In Binary)

        1's complement = 11011011

        2's complement:
          11011011
             +   1
         _________
          11011100

        Here, we can see the 2's complement of 36 (i.e. -36) is 11011100.
        This value is equivalent to the bitwise complement of 35.
        Hence, we can say that the bitwise complement of 35 is -(35 + 1) = -36.
         */



    }
}
