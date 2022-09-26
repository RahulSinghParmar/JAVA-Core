public class Arrays
{
    /*
    How to Access Elements of an Array in Java?

We can access the element of an array using the index number.
Here is the syntax for accessing elements of an array,

// access array elements
array[index]

Let's see an example of accessing array elements using index numbers.
     */

    public static void main(String[] args)
    {
        // declare and initialize array elements
        int[] age = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        // here we have store integer data type of similar type i.e. same data_type
        // int[] - it is primitive data type like int , char, double, byte etc.
        // age   - it is an identifier

        // access elements of array using index numbers
        System.out.println(" *** Accessing Elements of Array *** \n");

        System.out.println("First   Element : " + age[0]);
        System.out.println("Second  Element : " + age[1]);
        System.out.println("Third   Element : " + age[2]);
        System.out.println("Fourth  Element : " + age[3]);
        System.out.println("Fifth   Element : " + age[4]);
        System.out.println("Sixth   Element : " + age[5]);
        System.out.println("Seventh Element : " + age[6]);
        System.out.println("Eight   Element : " + age[7]);
        System.out.println("Ninth   Element : " + age[8]);
        System.out.println("Tenth   Element : " + age[9]);

    }
}



/*
Note:

    Array indices always start from 0. That is, the first element of an array is at index 0.
    If the size of an array is n, then the last element of the array will be at index n-1.
 */