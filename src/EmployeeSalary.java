import java.util.Scanner;

public class EmployeeSalary
{
    public static void main(String[] args)
    {
        //Local variables
        String name, identification;
        double basicSalary;
        double hra,da,ta,pf, grossSalary;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee name");
        name=scanner.next();

        System.out.println("Enter employee ID");
        identification=scanner.next();

        System.out.println("Enter Basic Salary");
        basicSalary=scanner.nextDouble();

        //calculation of HRA, DA, Ta, PF, Gross salary.
        hra=(basicSalary/100)*10;
        da=(basicSalary/100)*8;
        ta=(basicSalary/100)*9;
        pf=(basicSalary/100)*20;
        grossSalary=(basicSalary+hra+ta+da)-pf;
        System.out.println("Name :- "+name);
        System.out.println("ID   :-"+identification);
        System.out.println("HRA =  "+hra +"\nDA  =  "+da+"\nTA  =  "+ta+"\npf  =  "+pf);
        System.out.println("Gross Salary  =  "+grossSalary);

    }
}
