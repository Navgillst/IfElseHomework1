import java.util.Scanner;//Importing java.util package

public class NameOfDays
{
    public static void main(String[] args)
    {
        int number;
        System.out.println("Enter any number between 1-7");
        Scanner scanner = new Scanner(System.in);//Creating Scanner class objet
        number = scanner.nextInt();
        //using switch case
        switch (number)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number");

        }

    }
}
