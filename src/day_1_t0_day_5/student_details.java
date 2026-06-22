package day_1_t0_day_5;

import java.util.Scanner;

public class student_details {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student_Id: ");
		int id=sc.nextInt();
		System.out.println("enter student name: ");
		String name = sc.next();
		
		System.out.println("enter maths marks: ");
		int maths=sc.nextInt();
		System.out.println("enter english marks: ");
		int english=sc.nextInt();
		System.out.println("enter social marks: ");
		int social=sc.nextInt();
		
		int total=maths+ english + social;
		double average= total/3;
		
		 // Narrowing Casting (double to int)
        int avg = (int) average;
        char grade;
		System.out.println("total average marks is :" + average);
		
		 // Grade conditions using && operator
        if(avg >= 90 && avg <= 100) {
            grade = 'A';
        }
        else if(avg >= 80 && avg < 90) {
            grade = 'B';
        }
        else if(avg >= 70 && avg < 80) {
            grade = 'C';
        }
        else if(avg >= 60 && avg < 70) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
		
        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);	
	}

}
