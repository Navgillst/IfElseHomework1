import java.util.Scanner;//Importing inbuilt java package

public class StudentDataAndResult2
{
    //main method
    public static void main(String args[])
    {
        //Initialization of variables
        String name, rollNumber;
        double math, science, english, total, average;

        System.out.println("Enter student name \t");
        //Created object of inbuilt Scanner class
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();

        System.out.println("Enter roll number \t");
        rollNumber = scanner.next();

        System.out.println("Enter marks for Math");
        math = scanner.nextDouble();

        System.out.println("Enter marks for Science");
        science = scanner.nextDouble();

        System.out.println("Enter marks for English");
        english = scanner.nextDouble();
        //Calculating total of three subjects
        total = math + science + english;
        //Calculating Average of three subjects
        average = total / 3;

        //Printing out Name, Roll number, Subject Marks ,Total , Average and Result.
        System.out.println("Student Name is :-  " + name + "\nStudent Roll Number is :-  " + rollNumber);
        System.out.println("Math marks     =  " + math);
        System.out.println("Science Marks  = " + science);
        System.out.println("English Marks  =  " + english);
        System.out.println("Student Total of 3 Subjects  =" + total);
        System.out.println("Student Average  =  " + average +"%");

        //if else condition
        if(math>=35&&science>=35&&english>=35)
        {
            //Nested if else
            if (average >= 80)
            {
                System.out.println("Grade  =  A+");

            }
            else if (average>=60)
            {
                System.out.println("Result  =  Grade A");

            }
            else if (average>=50)
            {
                System.out.println("Result  =  Grade B");

            }
            else if (average>=35)
            {
                System.out.println("Result   =  Grade c");

            }
            else
            {
                System.out.println("Result  =   Fail");
            }

        }
        else
        {
            System.out.println("Result  =  Fail");
        }
    }

}
