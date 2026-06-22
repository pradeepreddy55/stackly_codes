package Day_6;

import java.util.Scanner;

public class multiplication_table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		 int num = sc.nextInt();
		 System.out.println("the multiplication of "+ num + " table is");
	     for(int i = 1; i <= 10; i++) {
	          System.out.println(num + " x " + i + " = " + (num * i));
	      }
	        sc.close();
	}

}
