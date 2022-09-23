package Programing_Introduction;

public class Java_literals
{
    public static void main(String[] args)
    {
        /*There are 4 types of variables in Java programming language:
            - Instance Variables (Non-Static Fields)
            - Class Variables (Static Fields)
            - Local Variables
            - Parameters    */

        // 1 - Boolean Literals
        //In Java, boolean literals are used to initialize boolean data types. They can store two values: true and false.
        boolean present1 = true;
        boolean present2 = false;
        System.out.println("boolean value 1: " + present1);  //true
        System.out.println("boolean value 2: " + present2);   //false
        //it can store either ture or false
        System.out.println("==============================");

        // 2 - Integer literals
        //An integer literal is a numeric value(associated with numbers) without any fractional or exponential part.
        //There are 4 types of integer literals in Java:
        // binary (base 2)
        int binaryNumber = 0b10010; //binary Start with 0b
        // octal (base 8)
        int octalNumber = 027;  //octal no start with 0
        //decimal (base 10)
        int decimalNumber = 39; //
        // hexadecimal (base 16)
        int hexadecimalNumber = 0x2F;   //hex start with 0x
        System.out.println("Binary no: 0b10010 = " + binaryNumber);
        System.out.println("octal no: 027 = " + octalNumber);
        System.out.println("decimal no: 39 = " + decimalNumber);
        System.out.println("hexadecimal no: 0x2F = " + hexadecimalNumber);
        System.out.println("=================================");

        // 3 Floating point Literals
        //A floating-point literal is a numeric literal that has either a fractional form or an exponential form
        double pieDouble = 3.14;
        float pieFloat   = 3.1415919F;
        // 3.445*10^2
        double pieDoubleScientific = 3.445e2;
        System.out.println("Double : " + pieDouble);
        System.out.println("Float : " + pieFloat);
        System.out.println("double e^ : " + pieDoubleScientific);
        System.out.println("=================================");

        // 4 Character Literals
        //
        // .Character Literals are unicode character enclosed inside single quotes
        // in char we can write special characters such as 'abc...z' and  'ABC...Z' and '!@#$...()' and '123...0'
        char letter = 'a';
        char letter1 = '0';
        char letter2 = '$';
        System.out.println("char 1: " + letter);
        System.out.println("char 2: " + letter1);
        System.out.println("char 3: " + letter2);
        System.out.println("===================================");

        // 5 String literals
        //
        //A string literal is a sequence of characters enclosed inside double-quotes
        // In String we can write special characters such as "abc...z" , "ABC...Z" , "!@#$...()" and "123...0".
        String a = "Hey";
        String b = "Bye";
        System.out.println("String a : " + a);
        System.out.println("String b : " + b);  //print string data inside a variable
        System.out.println("=====================================");



    }

}
