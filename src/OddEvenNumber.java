import java.util.Scanner;

public class OddEvenNumber
{
    //Global integer variable "number"
    static int number;

    public static void main(String[] args)
     {
        //Statement for user input
        System.out.println("Enter any Number \t");

        //Importing Scanner class through object for user input
        Scanner scanner =new Scanner(System.in);
        number=scanner.nextInt();

        //Condition to find number is even or odd using ternary operators.
       String a = (number % 2==0)?"Even":"odd";

       //Printing Output
       System.out.println("Number is "+a);
     }
}
