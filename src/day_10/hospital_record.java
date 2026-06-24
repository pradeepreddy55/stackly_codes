package day_10;
import java.util.Scanner;
class Patient {
    private int patient_id;
    private String name;
    private String disease;
    private double bill;
    // Setter methods
    public void setPatient_id(int id) {
        this.patient_id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public void setBill(double bill) {
        this.bill = bill;
    }
    // Getter methods
    public int getPatient_id() {
        return patient_id;
    }
    public String getName() {
        return name;
    }
    public String getDisease() {
        return disease;
    }
    public double getBill() {
        return bill;
    }
    // Bill generation method
    void generateBill(int days) {
        double roomCharge = 1000;
        bill = days * roomCharge;
    }
    void displayDetails() {
        System.out.println("\n----- Patient Details -----");
        System.out.println("Patient ID: " + patient_id);
        System.out.println("Patient Name: " + name);
        System.out.println("Disease: " + disease);
        System.out.println("Total Bill: " + bill);
    }
}

public class hospital_record {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Patient p = new Patient();
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Patient Name: ");
        String name = sc.next();
        System.out.print("Enter Disease: ");
        String disease = sc.next();
        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();
        // setting values
        p.setPatient_id(id);
        p.setName(name);
        p.setDisease(disease);
        // generating bill
        p.generateBill(days);
        // printing details
        p.displayDetails();
        sc.close();
    }
}
