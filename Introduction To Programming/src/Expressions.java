public class Expressions {
    //Java Expressions
    //
    //A Java expression consists of variables, operators, literals, and method calls
    public static void main(String[] args)
    {
        int score;
        score = 90;
        //Here, score = 90 is an expression that returns an int. Consider another example,

        Double a = 2.2, b = 3.4, result;
        result = a + b - 3.4;
        //Here, a + b - 3.4 is an expression.

        boolean number1 = false;
        boolean number2 = true;
        if (number1 == number2)
            System.out.println("Number 1 is larger than number 2");
        //Here, number1 == number2 is an expression that returns a boolean value.
        // Similarly, "Number 1 is larger than number 2" is a string expression.


        // Java Statement
        //In Java, each statement is a complete unit of execution. For example,
        int val = 9*5;
        /*
        Here, we have a statement.
         The complete execution of this statement involves multiplying integers 9 and 5 and then assigning the result to the variable val.
        In the above statement, we have an expression 9 * 5. In Java, expressions are part of statements.
        */

        /*
        Java Expressions

        number = 10
        //statement
        number = 10;
        In the above example, we have an expression number = 10.
        Here, by adding a semicolon (;), we have converted the expression into a statement (number = 10;)

        */


        // java Declaration
        Double tax = 9.5;

        //The statement above declares a variable tax which is initialized to 9.5.
        //Note: There are control flow statements that are used in decision-making and looping in Java.
        // You will learn about control flow statements in later chapters.

    }
}