package day_1_t0_day_5;
import java.util.*;

public class employee_details {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Department: ");
        String department = sc.next();
        System.out.print("Enter Designation: ");
        String designation = sc.next();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter Experiance: ");
        int experience = sc.nextInt();
        double increment = 0;
        double bonus = 0;
        
          // Increment based on experience and department
        if(experience >= 5 && department.equals("IT")) {
            increment = salary * 0.20;   //20%
        }
        else if(experience >= 3) {
            increment = salary * 0.10;   //10%
        }
        else {
            increment = salary * 0.05;   //5%
        }
        
           // Bonus based on designation
        if(designation.equals("Manager")) {
            bonus = 10000;
        }
        else if(designation.equals("Developer")) {
            bonus = 5000;
        }
        else {
            bonus = 2000;
        }
        
        double grossPay = salary + increment + bonus;
        double tax = grossPay * 0.10;   //10% deduction
        double netPay = grossPay - tax;

        
        System.out.println("\n----- Employee Details -----");
        System.out.println("Employee Name is: " + name);
        System.out.println("Employee ID is: " + id);
        System.out.println("Enter Department is: " + department);
        System.out.println("Designation is: " + designation);
        System.out.println("Experience is: " + experience);
        System.out.println("Basic Salary is: " + salary);
        System.out.println("Increment is: " + increment);
        System.out.println("Bonus is: " + bonus);
        System.out.println("Gross Pay is: " + grossPay);
        System.out.println("Net Pay is: " + netPay);
        sc.close();

		

	}

}
