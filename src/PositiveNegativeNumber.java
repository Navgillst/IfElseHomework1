import java.util.Scanner;//importing java.util package

public class PositiveNegativeNumber
{

    public static void main(String[] args)
    {
        //Local variable
        int number;
        System.out.println("Enter Number");
        Scanner scanner = new Scanner(System.in);//creating Scanner class object
        number=scanner.nextInt();

        //use of if else statement
        if(number==0)
        {
            System.out.println("Number is '0'");
        }
        else if(number>=1)
        {
            System.out.println("Positive Number");

        }
        else
        {
            System.out.println("Negative Number");
        }

    }
}
