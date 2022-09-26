package Loop;

public class for_loop_VS_For_each_loop
{
    //Let's see how a for-each loop is different from a regular Java for loop.
    public static void main(String[] args)
    {
        // 1. Using for loop
        char[] vowel = {'a','e','i','o','u'};


        // iterating through an array using a for loop
        System.out.println("\nPrinting Vowel using For Loop\n");
        for (int i = 0; i <= 4; i++)
        {
            System.out.println(vowel[i]);
            //here [i] state that print each an every character at one's
        }



        // 2. Using For Each Loop
        System.out.println("\nPrinting Vowels using For Each\n");
        // iterating through an array using the for-each loop
        for (char items : vowel)
        {
            System.out.println(items);
        }

        /*
        Here, the output of both programs is the same. However, the for-each loop is easier to write and understand.
        This is why the for-each loop is preferred over the for loop when working with arrays and collections.
         */
    }
}
