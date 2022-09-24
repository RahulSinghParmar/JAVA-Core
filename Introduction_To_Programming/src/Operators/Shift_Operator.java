package Operators;

public class Shift_Operator
{
    /*
    Java Shift Operators
    There are three types of shift operators in Java:

        Signed Left Shift (<<)
        Signed Right Shift (>>)
        Unsigned Right Shift (>>>)
     */
    public static void main (String[] args)
    {
        /*
        1. Java Left Shift Operator
        The left shift operator shifts all bits towards the left by a certain number of specified bits.
        It is denoted by <<
         */
        System.out.println("\n ****  Java Left Shift Operator *****\n ");

        int a = 2, result;
        System.out.println("Value of a : " + a);
        // 2 bit left shift operator
        result = a << 1;
        System.out.println("a << 1 : " + result);   // 4


        /*
        2. Java Signed Right Shift Operator
        The signed right shift operator shifts all bits towards the right by a certain number of specified bits.
        It is denoted by >>
         */
        System.out.println("\n ****  Java Signed Right Shift Operator *****\n ");

        int number1 =  8;
        int number2 = -8;
        // 2 bit signed right shift operator
        System.out.println("number1 >> 2 : " + (number1 >> 2));  // 2
        System.out.println("number2 >> 2 : " + (number2 >> 2));  // -2
        /*
        When we shift any number to the right, the least significant bits (rightmost) are discarded and
        the most significant position (leftmost) is filled with the sign bit. For example,

        right shift of 8
        8 = 1000 (In Binary)

        perform 2 bit right shift
        8 >> 2:
        1000 >> 2 = 0010 (equivalent to 2)

        Here, we are performing the right shift of 8 (i.e. sign is positive).
        Hence, there no sign bit. So the leftmost bits are filled with 0 (represents positive sign).

        // right shift of -8
        8 = 1000 (In Binary)

        1's complement = 0111
        2's complement:

             0111
              + 1
           _______
             1000

        Signed bit = 1

        perform 2 bit right shift
        8 >> 2:
        1000 >> 2 = 1110 (equivalent to -2)

        Here, we have used the signed bit 1 to fill the leftmost bits
         */

        /*
        Java Unsigned Right Shift Operator
        Java also provides an unsigned right shift.
        It is denoted by >>>
         */
        System.out.println("\n ****  Java Unsigned Right Shift Operator *****\n ");
        // 2 bit unsigned right shift
        System.out.println("number1 >>> 2 : " + (number1 >>> 2));  //
        System.out.println("number2 >>> 2 : " + (number2 >>> 2));  //
        /*
        Here, the vacant leftmost position is filled with 0 instead of the sign bit.
        For example,

        // unsigned right shift of 8
        8 = 1000

        8 >>> 2 = 0010

        // unsigned right shift of -8
        -8 = 1000 (see calculation above)

        -8 >>> 2 = 0010
         */


    }
}
