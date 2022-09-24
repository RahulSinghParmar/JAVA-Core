package Operators;

import com.sun.tools.javac.Main;

public class InstanceOf_Operator
{
    /*
    The instanceof operator checks whether an object is an instanceof a particular class
    The instanceof operator in Java is used to check whether an object is an instance of a particular class or not.

    Its syntax is

    objectName instanceOf className;

    Here, if objectName is an instance of className,
    the operator returns true. Otherwise, it returns false
     */

    public static void main(String[] args)
    {
        String name = "test";   //creating a variable of string type
        boolean result1;    //creating a boolean variable
        result1 =  name instanceof String;  //checks if name is an instance of Sting
        System.out.println("Sting is an instance of name : " +  result1);    // print True

        InstanceOf_Operator obj = new InstanceOf_Operator();    // creating an Object (obj) of class (InstanceOf_Operator)
        boolean result2;
        result2 = obj instanceof InstanceOf_Operator;
        System.out.println("Object is an instance of InstanceOf_Operator : " + result2);

        /*
        In the above example, we have created a variable name of the String type and an object obj of the InstanceOf_Operator class.
        Here, we have used the instanceof operator to check whether name and obj are instances of the String and InstanceOf_Operator class respectively.
        And, the operator returns true in both cases.

        Note: In Java, String is a class rather than a primitive data type
         */


    }

}
