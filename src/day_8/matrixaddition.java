package day_8;

import java.util.Scanner;

public class matrixaddition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int r=sc.nextInt();
        System.out.println("enter number of columns: ");
        int c=sc.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int sum[][] = new int[r][c];
        System.out.println("Enter first matrix elements:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second matrix elements:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        // Matrix Addition Logic
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Addition of two matrices:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
