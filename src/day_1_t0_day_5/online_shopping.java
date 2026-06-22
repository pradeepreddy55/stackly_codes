package day_1_t0_day_5;
import java.util.*;

public class online_shopping {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        String product = sc.nextLine();
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();
        double discount;
        double paymentDiscount=0;
        double finalAmount;
        if (price >= 50000) {
            discount = price * 0.30;    //30 percent
        }
        else if (price >= 30000) {
            discount = price * 0.20;    //20 percent
        }
        else if (price >= 10000) {
            discount = price * 0.10;    //10 percent
        }
        else if (price >= 5000) {
            discount = price * 0.05;     //5 percent
        }
        else {
            discount = 0;             
        }
        
        double amountAfterDiscount = price - discount;
        System.out.println("\nSelect Payment Method");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.println("3. Cash");
        System.out.print("Enter your choice: ");
        int payment = sc.nextInt();
        // Payment method discount
        if(payment == 1) {
            paymentDiscount = amountAfterDiscount * 0.05;       //5 percent
        }
        else if(payment == 2) {
            paymentDiscount = amountAfterDiscount * 0.10;       //10 percent
        }
        else if(payment == 3) {
            paymentDiscount = 0;
        }
        else {
            System.out.println("Invalid Payment Method");
        }
        finalAmount = price - discount;
        
        System.out.println("\n----- Online Shopping Bill -----");
        System.out.println("Product Name  : " + product);
        System.out.println("Original Price: " + price);
        System.out.println("Discount Amount: " + discount);
        System.out.println("Payment Discount: " + paymentDiscount);
        System.out.println("Final Amount to Pay: " + finalAmount);
        sc.close();

	}

}
