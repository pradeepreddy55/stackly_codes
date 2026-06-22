package Day_6;

import java.util.Scanner;

public class electricityBill {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter the number of months:");
	        int n=sc.nextInt();
	        int units[] = new int[n];
	        double bill[] = new double[n];
	        double totalBill = 0;
	        for(int i = 0; i < 6; i++) {
	            System.out.print("Enter month " + (i+1) + " units: ");
	            units[i] = sc.nextInt();
	            if(units[i] <= 100) {
	                bill[i] = units[i] * 5;
	            }
	            else if(units[i] <= 200) {
	                bill[i] = (100 * 5) + (units[i] - 100) * 7;
	            }
	            else {
	                bill[i] = (100 * 5) +(100 * 7) +(units[i] - 200) * 10;
	            }
	            totalBill = totalBill + bill[i];
	        }
	        
	        System.out.println("6 months of electricity bill is");
	        for(int i = 0; i < 6; i++) {
	            System.out.println("Month " + (i+1) + " Units: " + units[i] + " Bill: Rs." + bill[i]);
	        }
	        System.out.println("Total 6 Months Bill: Rs." + totalBill);
	        sc.close();
	}

}
