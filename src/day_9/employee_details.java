package day_9;

class Employee {
    int employee_id;
    String employee_name;
    double basic_salary;
    Employee(int id, String name, double salary) {
        this.employee_id = id;
        this.employee_name = name;
        this.basic_salary = salary;
    }
    void display() {
        System.out.println("Employee Name: " + employee_name);
        System.out.println("Basic Salary: " + basic_salary);
    }
}
// Child class Manager
class Manager extends Employee {
    Manager(int id, String name, double salary) {
        super(id, name, salary);
    }
    void calculateSalary() {
        double bonus = 10000;
        double totalSalary = basic_salary + bonus;
        System.out.println("Manager Name: " + employee_name);
        System.out.println("Total Salary: " + totalSalary);
    }
}
// Child class Developer
class Developer extends Employee {
    Developer(int id, String name, double salary) {
        super(id, name, salary);
    }
    void calculateSalary() {
        double incentive = 5000;
        double totalSalary = basic_salary + incentive;
        System.out.println("Developer Name: " + employee_name);
        System.out.println("Total Salary: " + totalSalary);
    }
}
// Child class Intern
class Intern extends Employee {
    Intern(int id, String name, double salary) {
        super(id, name, salary);
    }
    void calculateSalary() {
        double allowance = 2000;
        double totalSalary = basic_salary + allowance;
        System.out.println("Intern Name: " + employee_name);
        System.out.println("Total Salary: " + totalSalary);
    }
}
public class employee_details {
    public static void main(String[] args){
        Manager m = new Manager(101,"Pradeep", 50000);
        Developer d = new Developer(102, "Rahul", 40000);
        Intern i = new Intern(103, "Sai", 10000);
        m.calculateSalary();
        System.out.println("----------------");
        d.calculateSalary();
        System.out.println("----------------");
        i.calculateSalary();
    }
}
