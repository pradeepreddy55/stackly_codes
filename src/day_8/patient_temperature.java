package day_8;

import java.util.Scanner;

public class patient_temperature {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of patients: ");
        int patients=sc.nextInt();
        int temp[][] = new int[patients][3];

        // Reading temperatures
        for(int i = 0; i < patients; i++) {
            System.out.println("Enter temperature of Patient " + (i + 1));
            for(int j = 0; j < 3; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temp[i][j] = sc.nextInt();
            }
        }

        // Checking fever
        System.out.println("Patients having fever:");
        for(int i = 0; i < patients; i++) {
            boolean fever = false;
            for(int j = 0; j < 3; j++) {
                if(temp[i][j] > 100) {
                    fever = true;
                }
            }
            if(fever == true) {
                System.out.println("Patient " + (i + 1) + " has fever");
            }
            else {
                System.out.println("Patient " + (i + 1) + " has no fever");
            }
        }
        sc.close();
    }
}
