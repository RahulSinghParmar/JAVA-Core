package Loop;
/*
Java do...while loop

The do...while loop is similar to while loop. However, the body of do...while loop is executed once before the test expression is checked. For example,

do {
    // body of loop
} while(textExpression);

Here,

    1. The body of the loop is executed at first. Then the textExpression is evaluated.
    2. If the textExpression evaluates to true, the body of the loop inside the do statement is executed again.
    3. The textExpression is evaluated once again.
    4. If the textExpression evaluates to true, the body of the loop inside the do statement is executed again.
    5. This process continues until the textExpression evaluates to false. Then the loop stops.

 */

public class Do_While_loop
{
    // Java Program to display numbers from 1 to 5
    // Program to find the sum of natural numbers from 1 to 100.
    public static void main(String[] args)
    {
        // initializing values
        int i = 1, n = 5;
        // do...while loop from 1 to 5
        do {
            System.out.println(i);  // first iteration it will print without checking condition
            i++;    //increment the value by one
        } while (i <= n);   // check the condition if true the goes to the do body

    }

}
