package programs;

public class P1
{
    // W.A.P using for_each_loop in array creation

    public static void main(String[] args)
    {
        // Create a array
        int[] age = {45, 12, 18, 7};

        // loop through the array
        // using for each loop
        System.out.println("using for each loop in array creation");
        for (int a : age)
        {
            System.out.println(a);
        }
    }

}
