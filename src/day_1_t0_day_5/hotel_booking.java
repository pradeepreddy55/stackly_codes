package day_1_t0_day_5;
import java.util.*;

public class hotel_booking {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("----- Hotel Booking System -----");
	        System.out.println("1. AC Room");
	        System.out.println("2. Non-AC Room");
	        System.out.print("Select Room Type: ");
	        int room = sc.nextInt();
	        switch(room) {
            case 1:
                System.out.println("You selected AC Room");
                System.out.println("Price: Rs.3000");
                System.out.println("\nComplimentary Food");
                System.out.println("1. Morning Breakfast");
                System.out.println("2. Afternoon Lunch");
                System.out.print("Select Food: ");
                int food1 = sc.nextInt();
                
                // Nested switch
                switch(food1) {
                    case 1:
                        System.out.println("Morning Breakfast Added");
                        break;
                    case 2:
                        System.out.println("Afternoon Lunch Added");
                        break;
                    default:
                        System.out.println("Invalid Food Choice");
                }
                break;
            case 2:

                System.out.println("You selected Non-AC Room");
                System.out.println("Price: Rs.1500");

                System.out.println("\nComplimentary Food");
                System.out.println("1. Morning Breakfast");
                System.out.println("2. Afternoon Lunch");

                System.out.print("Select Food: ");
                int food2 = sc.nextInt();
                // Nested switch
                switch(food2) {
                    case 1:
                        System.out.println("Morning Breakfast Added");
                        break;
                    case 2:
                        System.out.println("Afternoon Lunch Added");
                        break;
                    default:
                        System.out.println("Invalid Food Choice");
                }
                break;
            default:
                System.out.println("Invalid Room Choice");
        }
        sc.close();
	}

}
