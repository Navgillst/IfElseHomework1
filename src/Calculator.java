import java.util.Scanner;//Importing java.util package

public class Calculator
{
    public static void main(String[] args)
    {
        //Local variables
        int number1,number2;
        String operator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        number1= scanner.nextInt();
        System.out.println("Enter second Number");
        number2 = scanner.nextInt();
        System.out.println("Enter Operator");
        operator = scanner.next();
        //switch case statements
        switch (operator) {
            case "+":
                System.out.println("Addition = " + (number1 + number2));
                break;
            case "-":
                System.out.println("Subtraction =   " + (number1 - number2));
                break;
            case "*":
                System.out.println("Multiplication =  " + (number1 * number2));
                break;
            case "/":
                System.out.println("division =   " + (number1 / number2));
                break;
            default:
                System.out.println("Invalid Operator");

        }

    }
}
