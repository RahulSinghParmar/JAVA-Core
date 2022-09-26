/*
Java Break Statement
The break statement in Java terminates the loop immediately,
and the control of the program moves to the next statement following the loop.

It is almost always used with decision-making statements (Java if...else Statement).

Here is the syntax of the break statement in Java:

break;

 */
public class Break
{
    // program to print 1 to 5 using break statement
    public static void main(String[] args)
    {
        // for condition to print no from 1 to 10
        for (int i = 1; i <= 10; i++)
        {
            //if the value of i is 6 the if loop will terminate by break statement
            if ( i == 6 )
            {
                break;
            }
            System.out.println(i);
        }

    }

}


/*
In the above program, we are using the for loop to print the value of i in each iteration.
To know how for loop works, visit the Java for loop. Here, notice the statement,

if (i == 6) {
    break;
}

This means when the value of i is equal to 6, the loop terminates.
Hence, we get the output with values less than 6 only.
 */