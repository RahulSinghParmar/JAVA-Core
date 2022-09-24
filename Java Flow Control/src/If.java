public class If
{
    /*
    Java if (if-then) Statement
    if - it is type of DMS (Decision-making statement) which is used to make a decision to execute a set of statement's based on single Condition
    The syntax of an if-then statement is:

    if (condition) {
    // statements
    }


     */
    public static void main(String[] args)
    {
        // 1. using integer
        int number = 18;
        //  Here, condition is a boolean expression such as number < 0.
        //  if condition evaluates to true, statements are executed
        //  if condition evaluates to false, statements are skipped

        //check if no. is less than 0
        if (number < 0) //if condition
        {
            //if Statement true the outside block will execute every an evey statement
            System.out.println("The integer number is negative.");
        }//by default return block
        //number < 0 is false. Hence, the code inside the body of the if statement is skipped.
        System.out.println("Statement outside integer if block");

        // 2 using String

        //create string variable
        String name = "Java";
        //if statement
        if (name == "Java")
        {
            System.out.println("String name executed");
        }





    }
}
