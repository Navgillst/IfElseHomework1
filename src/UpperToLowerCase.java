import java.util.Scanner;

public class UpperToLowerCase
{
    public static void main(String[] args)
    {
        char ch;
        System.out.println("Enter any alphabet in Uppercase");
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);
       char characterLowercase = Character.toLowerCase(ch);//changing uppercase to lowercase
        System.out.println("Lowercase =  "+characterLowercase);

    }
}
