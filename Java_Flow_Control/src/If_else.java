public class If_else
{
    /*
    Java if...else (if-then-else) Statement

    The if statement executes a certain section of code if the test expression is evaluated to true.
    However, if the test expression is evaluated to false, it does nothing.

    In this case, we can use an optional else block. Statements inside the body of else block are executed if the test expression is evaluated to false.
    This is known as the if-...else statement in Java.

    The syntax of the if...else statement is:

    if (condition) {
    // codes in if block
    }
    else {
    // codes in else block
    }
    // code after if...else

    Here, the program will do one task (codes inside if block) if the condition is true and another task (codes inside else block) if the condition is false

     */

    public static void main(String[] args)
    {
        //create integer variable
        int age = 5;

        //check if the age is equal to or greater than 18 or not.
        if(age >= 18)
        {
            System.out.println("Yes, you can Drive a car");
        }
        //execute this block
        //if age is less the 18 then else block executed
        else
        {
            System.out.println("Sorry, you can't Drive a car");
        }
        //if condition is true then else block skipped and return out of block
        System.out.println("Statement outside if...else block");

        /*
        Now, change the value of the age to a negative integer. Let's say -5.

        int age = -5;

        If we run the program with the new value of number, the output will be:

        The number is not positive.
        Statement outside if...else block

        Here, the value of age is -5. So the test expression evaluates to false.
        Hence, code inside the body of else is executed.
         */

    }
}
