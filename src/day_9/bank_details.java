package day_9;

class BankAccount {
    int account_no;
    String holder_name;
    double balance;
    // Constructor
    BankAccount(int accNo, String name, double balance) {
        this.account_no = accNo;
        this.holder_name = name;
        this.balance = balance;
    }
    // Withdraw method
    void withdraw(double amount) {
        if(amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw Amount: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    void display() {
        System.out.println("Account Number: " + account_no);
        System.out.println("Holder Name: " + holder_name);
        System.out.println("Balance: " + balance);
    }
}
// Savings Account class
class SavingsAccount extends BankAccount {
    SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }
    void showSavingsDetails() {
        System.out.println("Savings Account Details");
        display();
    }
}
// Current Account class
class CurrentAccount extends BankAccount {
    CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }
    void showCurrentDetails() {
        System.out.println("Current Account Details");
        display();
    }
}
public class bank_details {
    public static void main(String[] args){
        SavingsAccount s = new SavingsAccount(101, "Pradeep", 50000);
        CurrentAccount c = new CurrentAccount(102, "Rahul", 80000);
        s.showSavingsDetails();
        s.withdraw(10000);
        System.out.println("After Withdrawal:");
        s.display();

        c.showCurrentDetails();
        c.withdraw(20000);
        System.out.println("After Withdrawal:");
        c.display();
    }
}
