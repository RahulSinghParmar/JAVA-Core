package Operators.Unary_Operators;

public class Pre_Decrement_Operator
{
    /*
    Pre Decrements operator
    we use decrement operator to decrement the value by one
    Syntax:-  --var_name;

    Rules for decrement operator
    1. decrement the value by one
    2. update the decremented value in the same variable
    3. if any operation is going on we will use the decremented value but not the current value.
     */
    public static void main(String[] args)
    {
        System.out.println("\n**** Pre_Decrement_Operator ****\n");

        int a = 90;
        --a;                    // a = 89
        int b = a - 34;         // b = 89 - 34 = 55
        --b;                    // b = 55 - 1 = 54
        int c = a + b;          // c = 89 + 54 = 143
        --c;                    // c = 143 - 1 = 142
        --b;                    // b = 54 - 1 = 53
        int d = --a + c;        /* d = (a=(  [89]    -1=      [88]    )=88) +  c  = 230
                                            cur_val         upd_val     88  + 142 = 230
                                           a = 88           c = 142
                                by using 2nd rule we have updated the value of a
                                by 3rd rule we take the upd_val(updated value)  a = 88
                                */
        --d;                    // d = 230 - 1 = 229
        System.out.println("value of a : " + a);    //88
        System.out.println("value of b : " + b);    //53
        System.out.println("value of c : " + c);    //142
        System.out.println("value of d : " + d);    //229
    }
}
