public class Switch_Case
{
    /*
    The switch statement allows us to execute a block of code among many alternatives.

    The syntax of the switch statement in Java is:

    switch (expression) {

    case value1:
       // code
      break;

     case value2:
       // code
       break;

      ...
    ...

    default:
      // default statements
     }

    How does the switch-case statement work?

    The expression is evaluated once and compared with the values of each case.

        If expression matches with value1, the code of case value1 are executed.
        Similarly, the code of case value2 is executed if expression matches with value2.
        If there is no match, the code of the default case is executed.

    Note: The working of the switch-case statement is similar to the Java if...else...if ladder.
    However, the syntax of the switch statement is cleaner and much easier to read and write.
     */
    public static void main(String[] args)
    {
        int number = 5; // number
        String language;

        //switch statement for choosing language
        switch(number)
        {
            case 1:
                language = "Java";
                break;
            case 2:
                language = "C";
                break;
            case 3:
                language = "C++";
                break;
            case 4:
                language = "C#";
                break;
            case 5:
                language = "Python";
                break;
            case 6:
                language = "Scala";
                break;
                //The break statement is used to terminate the switch-case statement.
                // If break is not used, all the cases after the matching case are also executed
            default:    //default case
                language = "You have enter Wrong input";
                break;
                //Here, the value of expression doesn't match with any of the cases.
                //Hence, the code inside the default case is executed
        }
        System.out.println("Chose the language : " + language);
    }
}

/*
 * Rules for Switch Case
 * - we cannot write boolean, long, float, double as input for switch cases there should be no duplicate labels
 * - break statements are not mandatory
 * - default statement can be written anywhere inside the switch-case statement block
 * - break statement will be executed only when the action is performed.
 */