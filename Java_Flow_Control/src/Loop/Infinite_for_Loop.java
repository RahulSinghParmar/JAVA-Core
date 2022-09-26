package Loop;

public class Infinite_for_Loop
{
    public static void main(String[] args)
    {
        // If we set the test expression in such a way that it never evaluates to false, the for loop will run forever.
        // This is called infinite for loop.

        int sum = 0;
        for (int i = 1; i >= sum; i++)
        {
            System.out.println("infinite loop");
        }
        // Here, the test expression ,
        // i >= sum, is never false and "infinite loop" is printed repeatedly until the memory runs out.


    }
}
