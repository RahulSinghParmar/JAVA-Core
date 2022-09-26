package Programs;

import java.util.Scanner;

public class P4
{
    //Write a program to print sum of positive numbers
    // Using While loop
    public static void main(String[] args)
    {
        int sum = 0;
        //create an object of scanner class
        Scanner input = new Scanner(System.in);
        // take integer input from the user
        System.out.println("Enter the positive no: ");
        int number = input.nextInt();

        //while loop continues until entered number is negative
        while (number >= 0)
        {
            //add only positive number
            sum += number;
            System.out.println("Enter no ");
            number = input.nextInt();
        }
        System.out.println("\nSum of all the positive numbers are " + sum);
        input.close();  // close the scanner object

    }
}

/*
In the above program, we have used the Scanner class to take input from the user.
Here, nextInt() takes integer input from the user.

The while loop continues until the user enters a negative number.
During each iteration, the number entered by the user is added to the sum variable.

When the user enters a negative number, the loop terminates.
Finally, the total sum is displayed.
 */
