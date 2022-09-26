public class Variable_Rules
{
    /*
    Rules for using local variables
    - we cannot use local variable without initialization
    - local variables are not assigned with default values
    - we cannot create more then one variable with same name
    - local variables can be used only inside local area but cannot be used inside global area

    NOTE: Global variables can be used inside global area as well as local area.

     */

    public static void main(String[] args)
    {
        int i;  //local variable
        //System.out.println(i);  // compile time error
    }

    public void test()
    {
        int i = 20;
        int j = 10; //
    }   // CTE


    //System.out.println(i); // compile time error


}
