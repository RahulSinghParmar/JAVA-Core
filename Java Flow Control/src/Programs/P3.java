package Programs;

// Calculate the sum of all elements of an array
public class P3
{
    //Sum of Array Elements using for Each loops
    public static void main(String[] args)
    {
        int[] numbers = {3, 4, 5, -5, 0, 12};
        int sum = 0;
        // iterating through each element of the array
        for (int number : numbers )
        {
            sum += number;
            //we have added each element of the numbers array to the sum variable in each iteration of the loop
        }
        System.out.println("Sum of an arrays: " + sum); // 19
    }
}
/*
    In the above program, the execution of the for each loop looks as:

    Iteration         	Variables

        1           	number = 3
                        sum = 0 + 3 = 3

        2           	number = 4
                        sum = 3 + 4 = 7

        3           	number = 5
                        sum = 7 + 5 = 12

        4           	number = -5
                        sum = 12 + (-5) = 7

        5           	number = 0
                        sum = 7 + 0 = 7

        6           	number = 12
                        sum = 7 + 12 = 19
 */