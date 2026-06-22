package day_1_t0_day_5;
import java.util.*;

public class username_password_validation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        // Nested if conditions
        if(mobile.length() == 10) {
            if(email.contains("@") && email.contains(".com")) {
                if(username.equals("pradeep")) {
                    if(password.equals("123")) {
                        System.out.println("Login Successful");
                    }
                    else {
                        System.out.println("Invalid Password");
                    }
                }
                else {
                    System.out.println("Invalid Username");
                }
            }
            else {
                System.out.println("Invalid Email");
            }
        }
        else {
            System.out.println("Invalid Mobile Number");
        }

        sc.close();

	}

}
