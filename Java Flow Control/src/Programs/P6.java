package Programs;

public class P6
{
    //Display numbers to print from 1 to 5 using for loop
    //                   print from 5 to 1 using for loop
    //                   print from  5 to 10 using for loop
    public static void main(String[] args)
    {
        int n = 5;

        System.out.println("\nTo print from 1 to 5\n");

        for (int i = 1; i <= n; i++)
        {
            System.out.println(i);
        }
        /*
        Here is how the program works.

        Iteration       Variable	Condition: i <= n       Action

        1st         	i = 1               true            1 is printed.
                        n = 5                               i is increased to 2.

        2nd         	i = 2               true            2 is printed.
                        n = 5                               i is increased to 3.

        3rd         	i = 3               true            3 is printed.
                        n = 5                               i is increased to 4.

        4th         	i = 4               true            4 is printed.
                        n = 5                               i is increased to 5.

        5th         	i = 5               true            5 is printed.
                        n = 5                               i is increased to 6.

        6th         	i = 6               false           The loop is terminated
                        n = 5

         */

        System.out.println("\nTo Print from 5 to 1\n");

        for (int i = 5; i >= 1; i--)
        {
            System.out.println(i);
        }

        System.out.println("\nTo Print from  5 to 10\n");

        for (int i =5; i <= 10; i++)
        {
            System.out.println(i);
        }
    }
}
