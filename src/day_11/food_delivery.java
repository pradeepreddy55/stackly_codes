package day_11;
import java.util.Scanner;
// Interface
interface FoodDelivery {
    void selectItem();
    void generateBill();
}
// Implementation Class
class OnlineFoodDelivery implements FoodDelivery {
    String customerName;
    int choice, quantity;
    double price = 0;
    double deliveryCharge = 40;
    double totalBill = 0;
    Scanner sc = new Scanner(System.in);
    // Method to select food item
    public void selectItem() {
        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();
        System.out.println("\n========= FOOD MENU =========");
        System.out.println("1. Burger      - Rs.120");
        System.out.println("2. Pizza       - Rs.250");
        System.out.println("3. Biryani     - Rs.180");
        System.out.println("4. Dosa        - Rs.80");
        System.out.println("5. Fried Rice  - Rs.150");
        System.out.print("\nSelect Item: ");
        choice = sc.nextInt();
        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();
        switch(choice) {
            case 1:
                price = 120;
                break;
            case 2:
                price = 250;
                break;
            case 3:
                price = 180;
                break;
            case 4:
                price = 80;
                break;
            case 5:
                price = 150;
                break;
            default:
                System.out.println("Invalid Item!");
                price = 0;
        }
    }
    // Method to generate bill
    public void generateBill() {
        totalBill = (price * quantity) + deliveryCharge;
        System.out.println("\n========== BILL ==========");
        System.out.println("Customer Name   : " + customerName);
        switch(choice) {
            case 1:
                System.out.println("Food Item       : Burger");
                break;
            case 2:
                System.out.println("Food Item       : Pizza");
                break;
            case 3:
                System.out.println("Food Item       : Biryani");
                break;
            case 4:
                System.out.println("Food Item       : Dosa");
                break;
            case 5:
                System.out.println("Food Item       : Fried Rice");
                break;
        }
        System.out.println("Price           : Rs." + price);
        System.out.println("Quantity        : " + quantity);
        System.out.println("Food Cost       : Rs." + (price * quantity));
        System.out.println("Delivery Charge : Rs." + deliveryCharge);
        System.out.println("------------------------------");
        System.out.println("Total Bill      : Rs." + totalBill);
        System.out.println("------------------------------");
        System.out.println("Order Placed Successfully!");
        System.out.println("Your order will be delivered in 30 minutes.");
    }
}

public class food_delivery {
    public static void main(String[] args){
        FoodDelivery order = new OnlineFoodDelivery();
        order.selectItem();
        order.generateBill();

    }
}
