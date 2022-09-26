public class Label_continue_statement
{
    /*
    It includes the label of the loop along with the continue keyword. For example,

    continue label;

    Here, the continue statement skips the current iteration of the loop specified by label

     We can see that the label identifier specifies the outer loop. Notice the use of the continue inside the inner loop.

    Here, the continue statement is skipping the current iteration of the labeled statement (i.e. outer loop).
    Then, the program control goes to the next iteration of the labeled statement.
     */
    public static void main(String[] args)
    {
        // outer loop is labeled as first
        first:
        for (int i = 1; i < 6; i++)
        {
            //inner loop is labeled as second
            second:
            for (int j = 1; j < 6; j++)
            {
                if (i == 3 || j == 2)

                    //skips the current iteration of outer loop
                    continue first;
                System.out.println("i = "+ i + "  , j = " + j);
            }
        }
        /*
        In the above example, the labeled continue statement is used to skip the current iteration of the loop labeled as first.

        if (i==3 || j==2)
            continue first;

        Here, we can see the outermost for loop is labeled as first,

        first:
        for (int i = 1; i < 6; ++i) {..}

        Hence, the iteration of the outer for loop is skipped if the value of i is 3 or the value of j is 2.
         */
    }
}
