package day_1_t0_day_5;
import java.util.*;

public class month_day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	      System.out.print("Enter Month Number (1-12): ");
	      int month = sc.nextInt();
	      System.out.print("Enter Year: ");
	      int year = sc.nextInt();
	      String monthName = "";
	      int days = 0;
	      if(month == 1) {
	            monthName = "January";
	            days = 31;
	        }
	        else if(month == 2) {
	            monthName = "February";
	            // Leap year checking using compound expression
	            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	                days = 29;
	            }
	            else {
	                days = 28;
	            }
	        }
	        else if(month == 3) {
	            monthName = "March";
	            days = 31;
	        }
	        else if(month == 4) {
	            monthName = "April";
	            days = 30;
	        }
	        else if(month == 5) {
	            monthName = "May";
	            days = 31;
	        }
	        else if(month == 6) {
	            monthName = "June";
	            days = 30;
	        }
	        else if(month == 7) {
	            monthName = "July";
	            days = 31;
	        }
	        else if(month == 8) {
	            monthName = "August";
	            days = 31;
	        }
	        else if(month == 9) {
	            monthName = "September";
	            days = 30;
	        }
	        else if(month == 10) {
	            monthName = "October";
	            days = 31;
	        }
	        else if(month == 11) {
	            monthName = "November";
	            days = 30;
	        }
	        else if(month == 12) {
	            monthName = "December";
	            days = 31;
	        }
	        else {
	            System.out.println("Invalid Month");
	        }
	      if(month >= 1 && month <= 12) {
	            System.out.println("\nYear: " + year);
	            System.out.println("Month Name: " + monthName);
	            System.out.println("Number of Days: " + days);
	        }
	        sc.close();

	}

}
