import java.util.Scanner;

//In order to use the object of Scanner, we need to import java.util.Scanner package
public class Input
{
    //Java provides different ways to get input from the user.

    public static void main(String[] args)
    {
        //we need to create an object of the Scanner class. We can use the object to take input from the user
        //To get input from user using the object of Scanner class
        Scanner input = new Scanner(System.in); //create an object of the Scanner class

        // integer input
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        System.out.println("you enter number : " + number);

        // float input
        System.out.println("Please enter float number: ");
        float myFloat = input.nextFloat();
        System.out.println("you enter float number : " + myFloat);

        //double input
        System.out.println("Please enter double number: ");
        double myDouble  = input.nextDouble();
        System.out.println("you enter double number : " + myDouble);


        // string input
        System.out.println("Please enter a string: ");
        String myString = input.next();
        System.out.println("you enter string : " + myString);



        //closing the scanner object
        input.close();

    }
}
