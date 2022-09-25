/*
 the label identifier to specify the outer loop. Now, notice how the break statement is used (break label;).

 Here, the break statement is terminating the labeled statement (i.e. outer loop).
 Then, the control of the program jumps to the statement after the labeled statement.
 Here's another example:

while (testExpression) {
   // codes
   second:
   while (testExpression) {
      // codes
      while(testExpression) {
         // codes
         break second;
      }
   }
   // control jumps here
}

In the above example, when the statement break second; is executed, the while loop labeled as second is terminated.
And, the control of the program moves to the statement after the second while loop.
*/

public class Label_break_statement
{
    public static void main(String[] args)
    {
        // for loop is labeled as first
        first:
        for (int i = 1; i < 5; i++)
        {
            // for loop loop is labeled as second
            second:
            for (int j = 1; j < 3; j++)
            {
                System.out.println("i = " + i + "; j = " + j);

                //the break statement breaks the first for loop
                if (i==2)
                    break first;
                /*
                In the above example, the labeled break statement is used to terminate the loop labeled as first.
                That is,

                first:
                for(int i = 1; i < 5; i++) {...}

                Here, if we change the statement break first; to break second;
                the program will behave differently.
                In this case, for loop labeled as second will be terminated
                 */
            }
        }
    }
}
/*
Note: The break statement is also used to terminate cases inside the switch statement
 */