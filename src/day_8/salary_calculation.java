package day_8;

import java.util.Scanner;

public class salary_calculation {

    // Method to calculate House Rent
    static double calculateHRA(double basic) {
        double hra = basic * 0.20;   // 20%
        return hra;
    }
    // Method to calculate Bonus
    static double calculateBonus(double basic) {
        double bonus = basic * 0.05; // 5%
        return bonus;
    }
    // Method to calculate Tax
    static double calculateTax(double gross) {
        double tax = gross * 0.10;   // 10%
        return tax;
    }
    public static void main(String  [] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        double hra = calculateHRA(basic);
        double bonus = calculateBonus(basic);
        double grossSalary = basic + hra + bonus;
        double tax = calculateTax(grossSalary);
        double netSalary = grossSalary - tax;
        System.out.println(" Salary Details is ");
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("Bonus: " + bonus);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Tax: " + tax);
        System.out.println("Net Salary: " + netSalary);
        sc.close();


    }
}
