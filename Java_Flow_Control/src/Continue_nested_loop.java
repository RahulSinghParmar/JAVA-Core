public class Continue_nested_loop
{
    // Java continue with Nested Loop
    //
    //In the case of nested loops in Java, the continue statement skips the current iteration of the innermost loop.
    public static void main(String[] args)
    {
        int i = 0, j = 0;

        while (i <= 3)
        {
            System.out.println("inner loop " + i);

            while (j <= 3)
            {
                if (j == 2)
                {
                    j++;
                    break;
                }
                System.out.println("outer loop " + j);
                j++;
            }
            i++;
        }
    }
}
