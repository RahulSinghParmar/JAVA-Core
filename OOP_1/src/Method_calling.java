public class Method_calling
{
    /*
    rules
    1. method gets execute te only when it is called.
    2. one method can be called any no's of time
    3. we can create any no of method inside global area.
    4. we cannot create a method inside another method

     */

    public static void legion()
    {
        System.out.println("\n Hey I'm legion... \n");
    }

    public static void main(String[] args)
    {
        System.out.println("Main method begins");
        legion();   // method calling Statement (MCS)
        System.out.println("Main method ends");

    }

}
