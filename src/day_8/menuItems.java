package day_8;

import java.util.Scanner;

public class menuItems {

    static void pizza() {
        System.out.println("You selected Pizza");
        System.out.println("Price = 200");
    }
    // Method for Burger
    static void burger() {
        System.out.println("You selected Burger");
        System.out.println("Price = 100");
    }
    // Method for Biryani
    static void biryani() {
        System.out.println("You selected Biryani");
        System.out.println("Price = 250");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------ MENU ------");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Biryani");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            pizza();
        } else if (choice == 2) {
            burger();
        } else if (choice == 3) {
            biryani();
        } else if (choice == 4) {
            System.out.println("Thank you");
        } else {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}

