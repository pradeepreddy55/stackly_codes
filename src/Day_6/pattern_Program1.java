package Day_6;

import java.util.Scanner;

public class pattern_Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num value:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println( );
		}

	}

}
