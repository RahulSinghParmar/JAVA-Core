package Operators.Unary_Operators;

public class Post_Decrement_Operator
{
    /*
    Post Decrement Operator
    Syntax: var_name --;

    Rules for postDecrement
    1. decrement the value by one
    2. update the decrement value in the same variable
    3. if any operation is going on we will use the current value but not the decremented value.
      */
    public static void main(String[] args)
    {
        System.out.println("\n**** Post_Decrement_Operator ****\n");

        int a = 1;
        int b = a--;                    // b = (a=[1] - 1) = 0 ,b = curr_val[1]
                                        // a = 0 and b = 1
        int c = a + b--;                // 0 + ([1]-1)=0
                                        // 0 + 1     = 1
        int d = b-- + c;                // ([0] -1 = -1 ) +1
                                        // 0 + 1 = 1
        int e = c-- + d--;              // ([0-1=0] + [1]-1=0)
                                        //  1       +    1    = 2

        System.out.println("value of a : " + a);
        System.out.println("value of b : " + b);
        System.out.println("value of c : " + c);
        System.out.println("value of d : " + d);
        System.out.println("value of d : " + e);
    }
}
