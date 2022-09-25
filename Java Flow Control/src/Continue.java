public class Continue
{
    /*
    Java continue

The continue statement skips the current iteration of a loop (for, while, do...while, etc).

After the continue statement, the program moves to the end of the loop.
And, test expression is evaluated (update statement is evaluated in case of the for loop).

Here's the syntax of the continue statement.

continue;

Note: The continue statement is almost always used in decision-making statements (if...else Statement).
     */
    public static void main(String[] args)
    {
        //for loop
        for (int i = 1; i <=10; i++)
        {
            //if the value of i is between 4 and 9
            //continue is executed
            if (i > 4 && i < 9)
            {
                continue;
                //Here, the continue statement is executed when the value of i becomes more than 4 and less than 9.
                //
                //It then skips the print statement for those values.
                // Hence, the output skips the values 5, 6, 7, and 8.
            }
            System.out.println(i);
        }
    }
}
