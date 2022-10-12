import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {
        //Local variable
        String salesId, sellerName;
        double salesAmount;
        double salaryBasic;
        double salesCommission;

        //Creating Scanner class object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sales ID   :-");
        salesId = scanner.next();

        System.out.println("Enter Seller Name   :-");
        sellerName = scanner.next();

        System.out.println("Enter Sales Amount   :-");
        salesAmount = scanner.nextDouble();

        System.out.println("Enter Basic Salary   :-");
        salaryBasic = scanner.nextDouble();

        //using if else statement to calculate commission.
        if(salesAmount>=50000)
        {
            salesCommission = (salesAmount/100)*35;
            System.out.println("35% Sales Commission  =  "+salesCommission);

        }
        else if (salesAmount>=30000)
        {
            salesCommission = (salesAmount/100)*20;
            System.out.println("20% Sales Commission  =  "+salesCommission);

        }
        else if (salesAmount>=20000)
        {
            salesCommission = (salesAmount/100)*10;
            System.out.println("10% Commission  =  "+salesCommission);

        }
        else if (salesAmount>=10000)
        {
            salesCommission = (salesAmount/100)*5;
            System.out.println("5% Sales Commission  =  "+salesCommission);

        }
        else
        {
            salesCommission = (salesAmount/100)*2;
            System.out.println("2% Sales Commission  =  "+salesCommission);
        }


    }
}
