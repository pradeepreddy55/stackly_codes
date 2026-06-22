package day_1_t0_day_5;
import java.util.*;

public class email_validation {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Email: ");
	        String email = sc.nextLine();
	        System.out.print("Enter Phone Number: ");
	        String phone = sc.nextLine();
	        if(email.contains("@") && email.contains(".com")) {
	            System.out.println("Valid Email");
	        }
	        else {
	            System.out.println("Invalid Email");
	        }
	        if(phone.length() == 10) {
	            System.out.println("Valid Phone Number");
	        }
	        else {
	            System.out.println("Invalid Phone Number");
	        }
	        sc.close();
	}

}
