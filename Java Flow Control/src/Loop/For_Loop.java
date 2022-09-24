package Loop;

public class For_Loop
{
/*
 * Java for Loop

    Java for loop is used to run a block of code for a certain number of times. The syntax of for loop is:

    for (initialExpression; testExpression; updateExpression) {
        // body of the loop
    }

    Here,
        1. The initialExpression initializes and/or declares variables and executes only once.
        2. The condition is evaluated. If the condition is true, the body of the for loop is executed.
        3. The updateExpression updates the value of initialExpression.
        4. The condition is evaluated again. The process continues until the condition is false.
 */


    //program to Display a Text Five Times
    public static void main(String[] args)
    {
        int n = 5;
        for (int i = 1; i <= n; ++i)
        //for(initialization ; Condition; Updation)
        {
            // body of the loop
            System.out.println("hello" + i);
        }
        // when the statement is false then the body of the for loop is executed
    }
}


/*
Here is how this program works.

    Iteration				Variable		Condition: i <= n          Action

    1st     				i = 1               true                hello is printed.
                            n = 5                                   i is increased to 2.

    2nd                     i = 2               true                hello is printed.
                            n = 5                                   i is increased to 3.

    3rd     				i = 3               true                hello is printed.
                            n = 5                                   i is increased to 4.

    4th        				i = 4               true                hello is printed.
                            n = 5                                   i is increased to 5.

    5th     				i = 5               true                hello is printed.
                            n = 5                                   i is increased to 6.

    6th        				i = 6               false               The loop is terminated.
                            n = 5

 */