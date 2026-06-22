package Day_6;

import java.util.Scanner;

public class number_gussing {

	public static void main(String[] args) {	
		 Scanner sc = new Scanner(System.in);
	        int correctNumber = 25;
	        for(int i = 1; i <= 5; i++) {
	            System.out.print("Enter your guess number: ");
	            int guess = sc.nextInt();
	            if(guess == correctNumber) {
	                System.out.println("Correct Guess! You Won");
	                break;
	            }
	            else if(guess > correctNumber) {
	                System.out.println("Your number is too high");
	            }
	            else {
	                System.out.println("Your number is too low");
	            }
	            System.out.println("Attempts left: " + (5 - i));
	        }
	        sc.close();

	}

}
