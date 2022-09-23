public class Java_DataType
{
    int speed;
    /* We have two type of Data Type
    1 The first type is Primitive Data Types
    2 The second type is Non-Primitive Data Types
    Java is a statically-typed language. This means that all variables must be declared before they can be used.
    Here, speed is a variable, and the data type of the variable is int
    */
    public static void main(String[] args)
    {
        /*
        Primitive Data_Type
        We have 8 different types of Primitive Data Types
        Primitive data type has fixed size
        */
        System.out.println("***** Primitive Data_Type  *****");
        System.out.println();   // spacing
        /*
        1. boolean type

            The boolean data type has two possible values, either true or false.
            thus it has [1] byte = 8 bits
            Default value: [false]
            They are usually used for true/false conditions.
        */
        boolean flag = true;
        System.out.println("Using Boolean  : " + flag);   //true


        // 2. byte type
        //
        //    The byte data type can have values from -128 to 127 (8-bit signed two's complement integer).
        //    thus it has [1] byte
        //    If it's certain that the value of a variable will be within -128 to 127, then it is used instead of int to save memory.
        //    Default value: 0
        byte range;
        range = 124;
        //byte b = 0;
        System.out.println("Using Byte     : " + range);   //124
        //System.out.println(b);   //0


        // 3. Short type
        //
        //    The short data type can have values from -32768 to 32767 (16-bit signed two's complement integer).
        //    thus it has [2] bytes
        //    If it's certain that the value of a variable will be within -32768 to 32767, then it is used instead of int to save memory (int, long).
        //    Default value: 0
        short temperature;
        temperature = -32768;
        System.out.println("Using Short    : " + temperature);   //-32768
        //short tem1 = 21;
        //System.out.println("Using Short    : " + tem1);   //21


        // 4. int type
        //
        //    The int data type can have values from -2147483648 to 2147483647 (32-bit signed two's complement integer).
        //    thus it has [4] bytes
        //    If you are using Java 8 or later, you can use an unsigned 32-bit integer. This will have a minimum value of 0 and a maximum value of 2^32 - 1.
        //    Default value: 0
        int size;
        size = -47483647;
        System.out.println("Using Int      : " + size);   //-47483647
        //int b = 0;
        //System.out.println(b);   //0


        // 5. Long type
        //
        //    The long data type can have values from -9223372036854775808 to 9223372036854775807 (64-bit signed two's complement integer).
        //    thus it has [8] bytes
        //    If you are using Java 8 or later, you can use an unsigned 64-bit integer. This will have a minimum value of 0 and a maximum value of 2^64 - 1.
        //    Default value: 0
        long size2;
        size2 = -9223372036854775808L;
        System.out.println("Using Long     : " + size2);   //-9223372036854775808L
        //long has = 5353563663554L;
        //System.out.println("Using Long     : " + has);     //53535636
        //Notice, the use of L at the end of -9223372036854775808L. This represents that it's an integer of the long type


        // 6. Double type
        //
        //    The double data type can have values from -3.4028234663852886e+38 to 3.4028234663852886e+38
        //    thus it has [8] bytes
        //    The double data type is a double-precision 64-bit floating-point.
        //    It should never be used for precise values such as currency.
        //    Default value: 0.0(0.0d)
        double number = 3.4028234663852886e+38d;
        System.out.println("Using Double   : " + number);   //3.4028234663852886e
        //double number1 = -135.54783;
        //System.out.println("Using Double   : " + number1);   //-135.54783


        // 7. float type
        //
        //    the float data type is a single-precision 32-bit floating-point
        //    thus it has [4] bytes
        //    Default value: 0.0(0.0f)
        float number2 = -43.4038f;
        // we have use -43.4038f instead of -43.4038, because -43.4038 is double literal
        // to tell compiler to treat -43.4038 as float rather than double, you need to use f or F.
        System.out.println("Using Float    : " + number2);   //3.4038
        //float number3 = 242.343f;
        //System.out.println("Using Float    : " + number3);   //242.343


        // 8. char type
        //
        // It's a 16-bit Unicode character.
        // thus it has [2] bytes
        // The minimum value of the char data type is '\u0000' (0) and the maximum value of char is '\uffff'.
        // Default value: '\u0000' or (   )
        //      char latter2 = 65;
        //      the letter2 variable is assigned 68 as an integer number (no single quotes).
        //      Hence, A is printed to the output. It is because Java treats characters as an integer and the ASCII value of A is 65
        //      System.out.println("Using Char     : " + latter2);   // A
        //char latter1 = '\u0051';
        //System.out.println("Using Char     : " + latter1);   // Q
        //Here, the Unicode value of Q is \u0051. Hence, we get Q as the output.
        char latter = '9';
        System.out.println("Using Char     : " + latter);   // 9






        //System.out.println("=============================================="); //separator
        System.out.println();
        System.out.println(" ***** Non Primitive Data_Type *******");
        System.out.println(); // spacing



        // Non-Primitive Data_Type
        // Java also provides support for character strings via java.lang.String class.
        // Strings in Java are not primitive types. Instead, they are objects
        // does not have fixed Size
        // default value is [NULL]
        String myString = "Hello I'm String";
        System.out.println("Using String   : " + myString);

    }
}
