import java.util.Scanner;//Importing java.util package

public class VoterEligibility
{
    public static void main(String[] args)
    {
        //Local variable
        int age;
        System.out.println("Enter your Age   :- ");
        Scanner scanner = new Scanner(System.in);

        //user input age
        age = scanner.nextInt();

        if(age>=18)
        {
            System.out.println("You are is Eligible to vote");
        }
        else
        {
            System.out.println("You are not Eligible to vote");
        }


    }
}
