package Day_6;

import java.util.Scanner;

public class perfect_number {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter starting number: ");
	        int start = sc.nextInt();
	        System.out.print("Enter ending number: ");
	        int end = sc.nextInt();
	        System.out.println("Perfect numbers are:");
	        for(int num = start; num <= end; num++) {
	            int sum = 0;
	            for(int i = 1; i < num; i++) {
	                if(num % i == 0) {
	                    sum = sum + i;
	                }
	            }
	            if(sum == num) {
	                System.out.println(num);
	            }
	        }
	        sc.close();
	}

}
