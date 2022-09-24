package Operators.Unary_Operators;

public class Post_Increment_Operator
{
    /*
    Syntax:- var_name ++;
    Rules for post increment
    1. Increments the value by one
    2. update the incremented value in same variable
    3. if any operation is going on we will use the current value not the updated value.
     */
    public static void main (String[] args)
    {
        System.out.println("\n**** Post_Increment_Operator ****\n");

        int a = 90;
        a++;                    //a = 91
        int b = a;              //b = 91
        b++;                    //b = 92
        int c = a++ - b++;      // c = (a=(     [91]       +1)=    [92]          ) - (b=(92+1)=93) = -1
                                /*
                                           ~Curr_val[91]        upp_val[92]
                                                                  a=92                 b=93
                                by 3rd rule in post increment we take the value of current variable
                                 a and b will be incremented but the value goes to c variable will be current value
                                 thus current val a and b 91 and 92 respectively 91-92 = -1
                                 since what ever the vale is in RHS will be assigned to LHS i.e c.
                                 */
        c++;                    //c = 0
        int e = a++;            /* e = (a=(    [92]        +1)=      [93])      =  curr_val[92]
                                            curr_val[92]         ~upp_val[93]
                                 by 2nd rule we have to increment the value of 'a' i.e. upp_val[93]
                                 by 3rd rule in post increment we take the value of curr_var[92](current variable)
                                // e = curr_val[92] = 92
                                */
        e++;                    //e = 93
        System.out.println("value of a : " + a);
        System.out.println("value of b : " + b);
        System.out.println("value of c : " + c);
        System.out.println("value of e : " + e);




    }
}
