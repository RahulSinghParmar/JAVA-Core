package Operators.Unary_Operators;

public class Pre_Increment_Operator
{
    /*
    Syntax:- ++ var_name;
    Rules for pre-increment operators
    1. Increment the value by 1
    2. update the incremented value in the same variable
    3. if any operation is going on we will use the incremented value but not the current value
     */

    public static void main(String[] args)
    {
        System.out.println("\n**** Pre_Increment_Operator ****\n");

        int a = 90;
        ++a;                    // a = 91
        int b = a - 34;         // b = 57
        // unary minus operator
        ++a;                    // a = 92
        int c = a + b;          // c = 92 + 57 = 149
        // unary minus operator
        ++c;                    // c = 150
        ++b;                    // b = 58
        int d = ++a - ++c;      // d = (a=(   [92]   +1)=     [93]   ) - (c=(150+1)=151) = -58
                                //          cur_val         upd_val
                                //                           a = 93           c=150
                                // by 3rd rule we take the upd_val(updated value)
        ++d;                    // d = -57
        System.out.println("value of a : " + a);    //92
        System.out.println("value of b : " + b);    //58
        System.out.println("value of c : " + c);    //150
        System.out.println("value of d : " + d);    //-57
    }
}
