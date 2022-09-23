package Programing_Introduction;

public class Variable_Naming_Rules {
    public static void main(String[] args)
    {
        //Java programming language has its own set of rules and conventions for naming variables
        //1-> java is case-sensitive. Hence, age and AGE are two different variable
        int age = 20;
        int AGE = 24;
        System.out.println(age);    //20
        System.out.println(AGE);    //24

        //2-> We cannot use All Special Characters, except _ and $
        int numbers = 10;   //valid name and good practice
        int _numbers = 0;   //valid but bad practice
        int $numbers = 1;   //valid but bad practice
        System.out.println(numbers);
        System.out.println(_numbers);
        System.out.println($numbers);

        //3-> Variable names cannot start with numbers. For example,
        //
        //
        //int 1age;  // invalid variables
        //System.out.println(1age); // error
        //
        //Variable names can't use whitespace. For example,
        //
        //
        //int my age;  // invalid variables
        //System.out.println(my age); //error


    }
}
