package day_10;
import java.util.Scanner;
class CarRental {
    // Hourly rent without driver
    void rent(String model, int hours) {
        int price = getPrice(model);
        int total = price * hours;
        System.out.println("Car Model: " + model);
        System.out.println("Hours: " + hours);
        System.out.println("Without Driver Rent: " + total);
    }
    // Hourly rent with driver
    void rent(String model, int hours, String driver) {
        int price = getPrice(model);
        int driverCharge = 500;
        int total = (price * hours) + driverCharge;
        System.out.println("Car Model: " + model);
        System.out.println("Hours: " + hours);
        System.out.println("With Driver Rent: " + total);
    }
    // Days wise rent without driver
    void rent(String model, double days) {
        int price = getPrice(model);
        int dayRent = price * 10;
        double total = dayRent * days;
        System.out.println("Car Model: " + model);
        System.out.println("Days: " + days);
        System.out.println("Without Driver Rent: " + total);
    }
    // Days wise rent with driver
    void rent(String model, double days, String driver) {
        int price = getPrice(model);
        int dayRent = price * 10;
        int driverCharge = 1000;
        double total = (dayRent * days) + driverCharge;
        System.out.println("Car Model: " + model);
        System.out.println("Days: " + days);
        System.out.println("With Driver Rent: " + total);
    }
    // Rent according to car model
    int getPrice(String model) {
        if(model.equalsIgnoreCase("Swift")) {
            return 200;     // per hour
        }
        else if(model.equalsIgnoreCase("Innova")) {
            return 400;
        }
        else if(model.equalsIgnoreCase("BMW")) {
            return 1000;
        }
        else {
            return 150;
        }
    }
}
public class car_rental {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CarRental c = new CarRental();
        System.out.println("Available Cars:");
        System.out.println("Swift");
        System.out.println("Innova");
        System.out.println("BMW");
        System.out.print("Enter Car Model: ");
        String model = sc.next();
        System.out.println("1. Hourly Rent");
        System.out.println("2. Day Rent");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        System.out.println("1. With Driver");
        System.out.println("2. Without Driver");
        System.out.print("Enter Driver choice: ");
        int driver = sc.nextInt();
        if(choice == 1) {
            System.out.print("Enter Hours: ");
            int hours = sc.nextInt();
            if(driver == 1) {
                c.rent(model, hours, "driver");
            }
            else {
                c.rent(model, hours);
            }
        }
        else if(choice == 2) {
            System.out.print("Enter Days: ");
            double days = sc.nextDouble();
            if(driver == 1) {
                c.rent(model, days, "driver");
            }
            else {
                c.rent(model, days);
            }
        }
        sc.close();
    }
}
