/**
 * @(#)ComputeWages.java
 *
 * ComputeWages application
 *
 * @author 
 * @version 1.00 2017/3/2
 */
 
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Scanner;


public class ComputeWages{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Array to hold list of Employee objects
        System.out.println("How many employees are there?");
        int noOfEmps = sc.nextInt();
        sc.nextLine();

        Employee[] empList = new Employee[noOfEmps];
        for(int i=0; i<noOfEmps; i++)
        {
            System.out.println("Enter employee id: ");
            int empId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter hourly rate: ");
            double rate = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter the number of working hours: ");
            int noOfHoursWorked = sc.nextInt();
            sc.nextLine();

            Employee employee = new Employee(empId, rate, noOfHoursWorked);
            empList[i] = employee;
        }
        System.out.println("\t\tEmployee Payroll Calculator\t\t");
        System.out.println("\tEmpId\t\t\tWages");
        System.out.println("------------------------------");
        for(int i=0; i<noOfEmps; i++)
        {
            empList[i].printPayroll();
        }
    }
}
