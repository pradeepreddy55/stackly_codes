package Day_7;

import java.util.Scanner;

public class sumofarray {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter array size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the array values:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum of array vlues is: "+ sum);
		sc.close();

	}

}
