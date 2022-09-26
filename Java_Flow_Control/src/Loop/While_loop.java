package Loop;
/*
    Java while loop

    Java while loop is used to run a specific code until a certain condition is met.
    The syntax of the while loop is:

    while (testExpression) {
        // body of loop
    }

    Here,
        1. A while loop evaluates the textExpression inside the parenthesis ().
        2. If the textExpression evaluates to true, the code inside the while loop is executed.
        3. The textExpression is evaluated again.
        4. This process continues until the textExpression is false.
        5. When the textExpression evaluates to false, the loop stops.

 */

public class While_loop
{
    public static void main(String[] args)
    {
        //declare variable
        int i = 1, n = 5;
        //while loop from 1 to 5
        while(i <= n)   //while condition
        {
            System.out.println(i);
            i++;    //increment the value of i by one
        }
    }
}

/*
Here is how this program works.

    Iteration		Variable	Condition: i <= n       Action

    1st				i = 1           true            1 is printed.
                    n = 5                           i is increased to 2.

    2nd				i = 2           true            2 is printed.
                    n = 5				            i is increased to 3.

    3rd				i = 3           true            3 is printed.
                    n = 5                           i is increased to 4.

    4th 			i = 4           true            4 is printed.
                    n = 5                           i is increased to 5.

    5th				i = 5           true            5 is printed.
                    n = 5                           i is increased to 6.

    6th				i = 6           false           The loop is terminated
                    n = 5

 */

