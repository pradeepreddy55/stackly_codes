package Day_6;

import java.util.Scanner;

public class pattern_program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
		int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
	}

}
