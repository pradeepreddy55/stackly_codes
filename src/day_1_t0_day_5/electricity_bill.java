package day_1_t0_day_5;
import java.util.*;

public class electricity_bill {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 System.out.print("Enter Previous Reading: ");
	        int previous = sc.nextInt();
	        System.out.print("Enter Current Reading: ");
	        int current = sc.nextInt();
	        
	        int units = current - previous;
	        double bill = 0;
	        System.out.print("Enter Type (house/shop): ");
	        String type = sc.next();
	       
	        if(units <= 100) {
	            bill = units * 5;
	        }
	        else if(units <= 200) {
	            bill = units * 7;
	        }
	        else {
	            bill = units * 10;
	        }
	        if(type.equals("house")) {
	            bill = bill - 100;               // ₹100 discount
	        }
	        System.out.println("Units Consumed: " + units);
	        System.out.println("Total Bill: ₹" + bill);
	        sc.close();


	}

}
