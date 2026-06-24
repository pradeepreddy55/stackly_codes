package day_10;
import java.util.Scanner;

public class HouseSystem {
    // Rent calculation method
    double calculateRent(double monthlyRent, int months) {
        return monthlyRent * months;
    }
    // Lease calculation method
    double calculateLease(double leaseAmount, int years) {
        return leaseAmount * years;
    }
    // Display method
    void display(String data[][]) {
        System.out.println("\n----- House Details -----");
        for(int i = 0; i < data.length; i++) {
            System.out.println("\nHouse " + (i + 1));
            System.out.println("Owner Name: " + data[i][0]);
            System.out.println("House Address: " + data[i][1]);
            System.out.println("House Type: " + data[i][2]);
            System.out.println("Total Amount: " + data[i][3]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HouseSystem h = new HouseSystem();
        System.out.print("Enter number of houses: ");
        int n = sc.nextInt();
        // Multidimensional array
        String house[][] = new String[n][4];
        for(int i = 0; i < n; i++) {
            System.out.println("\n--- Enter House " + (i + 1) + " Details ---");
            System.out.print("Enter Owner Name: ");
            house[i][0] = sc.next();
            System.out.print("Enter House Address: ");
            house[i][1] = sc.next();
            System.out.print("Enter Type (rent/lease): ");
            house[i][2] = sc.next();
            if(house[i][2].equalsIgnoreCase("rent")) {
                System.out.print("Enter Monthly Rent: ");
                double rent = sc.nextDouble();
                System.out.print("Enter Number of Months: ");
                int months = sc.nextInt();
                double amount = h.calculateRent(rent, months);
                house[i][3] = String.valueOf(amount);
            }
            else if(house[i][2].equalsIgnoreCase("lease")) {
                System.out.print("Enter Lease Amount Per Year: ");
                double lease = sc.nextDouble();
                System.out.print("Enter Number of Years: ");
                int years = sc.nextInt();
                double amount = h.calculateLease(lease, years);
                house[i][3] = String.valueOf(amount);
            }
            else {
                System.out.println("Invalid Type");
                i--;   // repeat same house input
            }
        }
        h.display(house);
        sc.close();

    }


}
