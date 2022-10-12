import java.util.Scanner;//importing java.util package

public class AverageOfNumber
{
    //Global variable integer and double
    static int number1, number2, number3, number4, number5;
    static double  total,average;
    public static void main(String[] args)
    {
        //objet of Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        number1=scanner.nextInt();
        System.out.println("Enter Second Number");
        number2=scanner.nextInt();
        System.out.println("Enter Third Number");
        number3=scanner.nextInt();
        System.out.println("Enter Fourth Number");
        number4=scanner.nextInt();
        System.out.println("Enter Fifth Number");
        number5=scanner.nextInt();

        //calculating total
        total = number1+number2+number3+number4+number5;

        //calculating average
        average = total /5;
        System.out.println("Total =  "+total+"\nAverage  =  "+average);

    }
}
