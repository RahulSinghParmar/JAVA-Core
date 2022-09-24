public class Nested_If_else
{
    /*
    Java Nested if..else Statement
    In Java, it is also possible to use if..else statements inside an if...else statement.
    It's called the nested if...else statement.

    Here's a program to find the largest of 3 numbers using the nested if...else statement
     */
    public static void main(String[] args)
    {
        //  declare double type variables
        double a = 5.4, b = 7.3 , c = -3.9, largest;
        //  checks if a is greater than or equal to b
        if(a >= b)
        {
            //  if..else statement inside the if block
            //  check if a is greater than or equal to c
            if(a >= c)
            {
                largest = a;
            }
            else
            {
                largest = c;
            }
        }
        else
        {
            //  if..else statement inside else block
            //  check if b is greater the or equal to c
            if(b >= c)
            {
                largest = b;
            }
            else
            {
                largest = c;
            }
        }
        System.out.println("Largest no is: " + largest);    //Largest bo is: 7.3

    }

}
