public class ladder_if_else_if
{
    /*
    Java if...else...if Statement

    In Java, we have an if...else...if ladder, that can be used to execute one block of code among multiple other blocks.

    if (condition1) {
      // codes
    }
    else if(condition2) {
    // codes
    }
    else if (condition3) {
    // codes
    }
    .
    .
    else {
    // codes
    }

    Here, if statements are executed from the top towards the bottom.
    When the test condition is true, codes inside the body of that if block is executed.
    And, program control jumps outside the if...else...if ladder.

    If all test expressions are false, codes inside the body of else are executed.
     */
    public static void main(String[] args)
    {
        int result = 75;
        //check the no. is equal to zero or greater to zero and less than 35
        if(result >= 0 && result < 35)
        {
            System.out.println("You have failed");
        }
        else if(result >= 35 && result < 50)
        {
            System.out.println("Result is average");
        }
        else if(result >=50 && result < 75) //result = 75 i.e. condition is true
        {
            //print result is good
            System.out.println("result is Good");
        }
        else if(result >=75 && result < 100)
        {
            //skipped
            System.out.println("result is Excellent");
        }

        System.out.println("Outside of the if...else...if block / out side the range");
        //Note: Java provides a special operator called ternary operator, which is a kind of shorthand notation of if...else...if statement.
    }

}
