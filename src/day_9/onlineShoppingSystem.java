package day_9;

class Product {
    int product_id;
    String product_name;
    double price;
    Product(int id, String name, double price) {
        this.product_id = id;
        this.product_name = name;
        this.price = price;
    }
    void display() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Product Name: " + product_name);
        System.out.println("Price: " + price);
    }
}
// Child class Electronics
class Electronics extends Product {
    int warranty_period;
    Electronics(int id, String name, double price, int warranty) {
        super(id, name, price);
        this.warranty_period = warranty;
    }
    void displayDetails() {
        display();
        System.out.println("Warranty Period: "
                + warranty_period + " years");
    }
}
// Child class Clothing
class Clothing extends Product {
    String size;
    Clothing(int id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }
    void displayDetails() {
        display();
        System.out.println("Size: " + size);
    }
}
// Child class Food
class Food extends Product {
    String expiry_date;
    Food(int id, String name, double price, String expiry) {
        super(id, name, price);
        this.expiry_date = expiry;
    }
    void displayDetails() {
        display();
        System.out.println("Expiry Date: " + expiry_date);
    }
}
public class onlineShoppingSystem {
    public static void main(String[] args){
        Electronics e = new Electronics(101, "Laptop", 55000, 2);
        Clothing c = new Clothing(102, "T-Shirt", 800, "Large");
        Food f = new Food(103, "Chocolate", 150, "20-12-2026");
        System.out.println("Electronics Details");
        e.displayDetails();
        System.out.println("--------------------");
        System.out.println("Clothing Details");
        c.displayDetails();
        System.out.println("--------------------");
        System.out.println("Food Details");
        f.displayDetails();
    }
}
