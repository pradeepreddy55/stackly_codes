package day_11;
import java.util.Scanner;
// Interface
interface Payment {
    void makePayment(double amount);
}
// Google Pay Class
class GooglePay implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment Successful through Google Pay.");
        System.out.println("Amount Paid: Rs." + amount);
    }
}
// PhonePe Class
class PhonePe implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment Successful through PhonePe.");
        System.out.println("Amount Paid: Rs." + amount);
    }
}
// Credit Card Class
class CreditCard implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment Successful through Credit Card.");
        System.out.println("Amount Paid: Rs." + amount);
    }
}
public class paymentGateway {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("===== Payment Gateway =====");
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Payment Amount: ");
        double amount = sc.nextDouble();
        System.out.println("\nSelect Payment Method");
        System.out.println("1. Google Pay");
        System.out.println("2. PhonePe");
        System.out.println("3. Credit Card");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        Payment payment;
        switch (choice) {
            case 1:
                payment = new GooglePay();
                payment.makePayment(amount);
                break;
            case 2:
                payment = new PhonePe();
                payment.makePayment(amount);
                break;
            case 3:
                payment = new CreditCard();
                payment.makePayment(amount);
                break;
            default:
                System.out.println("Invalid Choice");
        }
        System.out.println("Customer Name: " + name);
        sc.close();

    }
}
