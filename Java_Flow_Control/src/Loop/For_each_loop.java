package Loop;

public class For_each_loop
{
    /*
    In Java, the for-each loop is used to iterate through elements of arrays and collections (like ArrayList).
    It is also known as the enhanced for loop.

    For-each Loop Syntax

    The syntax of the Java for-each loop is:

    for(dataType item : array) {
        ...
    }

    Here,

        array - an array or a collection
        item - each item of array/collection is assigned to this variable
        dataType - the data type of the array/collection

     */

    //Print Array elements
    public static void main(String[] args)
    {
        // creat an array
        int[] numbers = { 3, 4, -5, 6, -7, 8, 9 ,0};
        // iterating through the array elements
        for (int n : numbers)
        {
            System.out.println("array elements: " + n);
        }
    }
}


/*
Here, we have used the for-each loop to print each element of the numbers array one by one.

In the first iteration of the loop, number will be 3, number will be 4 in second iteration and so on.
 */