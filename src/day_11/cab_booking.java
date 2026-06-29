package day_11;
import java.util.Scanner;
// Interface
interface CabService {
    void bookRide();
    void calculateFare();
}
// Mini Cab
class MiniCab implements CabService {
    String customerName;
    double distance;
    double fare;
    Scanner sc = new Scanner(System.in);
    public void bookRide() {
        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();
        System.out.print("Enter Distance (KM): ");
        distance = sc.nextDouble();
    }
    public void calculateFare() {
        fare = distance * 12; // Rs.12 per KM
        System.out.println("\n----- MINI CAB DETAILS -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Distance      : " + distance + " KM");
        System.out.println("Cab Type      : Mini Cab");
        System.out.println("Fare Amount   : Rs." + fare);
    }
}
// Auto Cab
class AutoCab implements CabService {
    String customerName;
    double distance;
    double fare;
    Scanner sc = new Scanner(System.in);
    public void bookRide() {
        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();
        System.out.print("Enter Distance (KM): ");
        distance = sc.nextDouble();
    }
    public void calculateFare() {
        fare = distance * 8; // Rs.8 per KM
        System.out.println("\n----- AUTO CAB DETAILS -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Distance      : " + distance + " KM");
        System.out.println("Cab Type      : Auto Cab");
        System.out.println("Fare Amount   : Rs." + fare);
    }
}
// Sedan Cab
class SedanCab implements CabService {
    String customerName;
    double distance;
    double fare;
    Scanner sc = new Scanner(System.in);
    public void bookRide() {
        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Distance (KM): ");
        distance = sc.nextDouble();
    }
    public void calculateFare() {
        fare = distance * 18; // Rs.18 per KM
        System.out.println("\n----- SEDAN CAB DETAILS -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Distance      : " + distance + " KM");
        System.out.println("Cab Type      : Sedan Cab");
        System.out.println("Fare Amount   : Rs." + fare);
    }
}

public class cab_booking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===== CAB BOOKING SYSTEM =====");
        System.out.println("1. Mini Cab");
        System.out.println("2. Auto Cab");
        System.out.println("3. Sedan Cab");
        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline
        CabService cab;
        switch (choice) {
            case 1:
                cab = new MiniCab();
                cab.bookRide();
                cab.calculateFare();
                break;
            case 2:
                cab = new AutoCab();
                cab.bookRide();
                cab.calculateFare();
                break;
            case 3:
                cab = new SedanCab();
                cab.bookRide();
                cab.calculateFare();
                break;
            default:
                System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}
