package Day_6;

import java.util.Scanner;

public class login_validation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 String correctUsername = "admin";
	        String correctPassword = "12345";
	        for(int attempts = 3; attempts > 0; attempts--) {
	            System.out.print("Enter Username: ");
	            String username = sc.nextLine();
	            System.out.print("Enter Password: ");
	            String password = sc.nextLine();
	            if(username.equals(correctUsername) && password.equals(correctPassword)) {
	                System.out.println("Login Successful");
	                break;
	            }
	            else {
	                System.out.println("Invalid Username or Password");
	                System.out.println("Remaining attempts: " + (attempts - 1));
	            }
	            if(attempts == 1) {
	                System.out.println("Account Locked");
	            }
	        }
	        sc.close();
		

	}

}
