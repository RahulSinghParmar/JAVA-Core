package Programs;

public class P2
{
    // Program to find the sum of natural numbers from 1 to 1000.
    public static void main(String[] args)
    {
        int n = 1000;
        int sum = 0;
        // initialize sum to store the value of sum of numbers

        //for loop
        for (int i = 1; i <= n; ++i)
        {
            // body of the loop
            sum += i;
            //sum = sum + i
        }
        System.out.println("Sum of natural number from 1 to 1000 \n : " + sum);
    }

}


/*
Here, the value of sum is 0 initially. Then, the for loop is iterated from i = 1 to 1000.
In each iteration, i is added to sum and its value is increased by 1.
When i becomes 1001, the test condition is false and sum will be equal to 0 + 1 + 2 + .... + 1000.
 */


//can be done by many logics
// by decrement the value by one
//for (int i = n; i >= 1; --i)