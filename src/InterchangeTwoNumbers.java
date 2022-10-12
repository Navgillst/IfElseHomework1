import java.util.Scanner;//java.util package

public class InterchangeTwoNumbers
{
    public static void main(String[] args)
    {
        //Local variable
        int firstNumber, secondNumber, storeNumber;
        Scanner scanner = new Scanner(System.in);// Scanner class object creation
        System.out.println("Enter First Number");
        firstNumber=scanner.nextInt();
        System.out.println("Enter Second Number");
        secondNumber=scanner.nextInt();
        storeNumber=firstNumber;
        firstNumber=secondNumber;
        secondNumber=storeNumber;
        System.out.println("Interchange of First Number =  "+firstNumber);//Printing interchange value
        System.out.println("Interchange of Second Number =  "+secondNumber);

    }
}
