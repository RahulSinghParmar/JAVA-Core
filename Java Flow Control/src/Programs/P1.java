package Programs;

import java.util.Scanner;

public class P1
{
    //write a program to compute the sum  of 5 positive number using continue;
    public static void main(String[] args)
    {
        // created an variable of data type double
        double number, sum = 0.0;
        // creat an object of scanner
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 6; ++i)
        {
            System.out.print("Enter number " + i + " : ");
            number = input.nextDouble();

            //if number is negative
            // continue statement is executed
            if (number <= 0.0)
            {
                continue;
                //Here, when the user enters a negative number, the continue statement is executed.
                // This skips the current iteration of the loop and takes the program control to
                // the update expression of the loop.
            }
            sum += number;
        }
        System.out.println("Total Sum of 5 positive no: " + sum);
        input.close();
    }
}
