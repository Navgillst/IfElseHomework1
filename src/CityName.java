import java.util.Scanner;//Importing java.util package

public class CityName
{

    public static void main(String[] args)
    {
        System.out.println("Enter any Alphabet between a to f  ");

        //object of scanner class
        Scanner scanner =new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        switch (ch)
        {
            case 'a':
                System.out.println("Aberdeen");
                break;
            case 'b':
                System.out.println("Belfast");
                break;
            case 'c':
                System.out.println("Cambridge");
                break;
            case 'd':
                System.out.println("Dover");
                break;
            case 'e':
                System.out.println("Edinburgh");
                break;
            case 'f':
                System.out.println("Frankfurt");
                break;
            default:
                System.out.println("Invalid Character");
        }
    }
}
