package day_8;

import java.util.Scanner;

public class studentAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();
        int marks[][] = new int[students][subjects];
        // Taking student marks
        for(int i = 0; i < students; i++) {
            System.out.println("Enter marks of Student " + (i + 1));
            for(int j = 0; j < subjects; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        // Calculating average
        for(int i = 0; i < students; i++) {
            int sum = 0;
            for(int j = 0; j < subjects; j++) {
                sum = sum + marks[i][j];
            }
            double average = sum / subjects;
            System.out.println("Student " + (i + 1) + " Average = " + average);
        }
        sc.close();
    }
}
