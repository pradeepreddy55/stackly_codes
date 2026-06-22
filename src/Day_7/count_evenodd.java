package Day_7;

import java.util.Scanner;

public class count_evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter array size: ");
	        int size = sc.nextInt();
	        int arr[] = new int[size];
	        System.out.println("Enter array elements:");
	        for(int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int evenCount = 0;
	        int oddCount = 0;
	        System.out.println("Even numbers are:");
	        for(int i = 0; i < size; i++) {
	            if(arr[i] % 2 == 0) {
	                System.out.println(arr[i]);
	                evenCount++;
	            }
	        }
	        System.out.println("Odd numbers are:");
	        for(int i = 0; i < size; i++) {
	            if(arr[i] % 2 != 0) {
	                System.out.println(arr[i]);
	                oddCount++;
	            }
	        }
	        System.out.println("Total even numbers = " + evenCount);
	        System.out.println("Total odd numbers = " + oddCount);

	        sc.close();

	}

}
