package programs;

public class P3
{
    // W.A.J.P to sum up all the array and take average of all the elements
    public static void main(String[] args)
    {
        int[] numbers = {3, -7, 0, 2, 14, -22, 25, 9, 8, 32};
        int sum = 0;
        double average;

        //access all the elements using for each loop
        // add each element in sum
        for (int number : numbers)
        {
            sum += number;
        }

        // get total number of elements
        int arrayLength = numbers.length;
        // get average of all elements from int to double
        average = ((double)sum / (double)arrayLength);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }
}

/*
In the above example, we have created an array of named numbers.
We have used the for...each loop to access each element of the array.

Inside the loop, we are calculating the sum of each element.
Notice the line,

int arrayLength = number.length;

Here, we are using the length attribute of the array to calculate the size of the array.
We then calculate the average using:

average = ((double)sum / (double)arrayLength);

As you can see, we are converting the int value into double.
This is called type casting in Java.
 */