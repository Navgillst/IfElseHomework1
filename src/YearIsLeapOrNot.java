import java.util.Scanner;//Importing inbuilt package

public class YearIsLeapOrNot
{
   // Global static integer variable year
    static int year;

    public static void main(String[] args)
    {
        System.out.println("Enter any Year \t");

        //calling Inbuilt Scanner class in package java.util.Scanner for user input for year
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        //if else condition to check year is leap or not
        if (year%4==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }

    }
}
