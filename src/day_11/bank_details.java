package day_11;
import java.util.Scanner;
// Abstract Class
abstract class Bank {
    String customerName;
    int accountNumber;
    double balance;
    // Constructor
    Bank(String customerName, int accountNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // Concrete Method
    void displayDetails() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : " + balance);
    }
    // Abstract Methods
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract void calculateInterest();
}
// Child Class
class SavingsAccount extends Bank {
    SavingsAccount(String customerName, int accountNumber, double balance) {
        super(customerName, accountNumber, balance);
    }
    @Override
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully.");
        System.out.println("Updated Balance: " + balance);
    }
    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful.");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
    @Override
    void calculateInterest() {
        double interest = balance * 5 / 100;
        System.out.println("Interest (5%): " + interest);
        System.out.println("Balance After Interest: " + (balance + interest));
    }
}

public class bank_details {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Bank Management System =====");
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        Bank account = new SavingsAccount(name, accNo, balance);
        int choice;
        do {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Calculate Interest");
            System.out.println("4. Display Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;
                case 2:
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;
                case 3:
                    account.calculateInterest();
                    break;
                case 4:
                    account.displayDetails();
                    break;
                case 5:
                    System.out.println("Thank You for Using Bank Management System.");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice != 5);
        sc.close();

    }
}
