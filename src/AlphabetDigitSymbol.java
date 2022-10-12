import java.util.Scanner;//Importing java.util package

public class AlphabetDigitSymbol
{
    public static void main(String[] args)
    {
        //character variable ch
        char ch;
        //object of inbuilt class Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Character :- ");
        ch = scanner.next().charAt(0);

        //if else condition
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {

            System.out.println(ch + " is A Alphabet");

        }
        else if(ch >= '0' && ch <= '9') {

            System.out.println(ch + " is A Digit");

        }
        else
        {
            System.out.println(ch + " is A Symbol");
        }
    }
}
