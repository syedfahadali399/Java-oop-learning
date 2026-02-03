package labsession7;

abstract class Employee {

    String name;
    int id;

    public abstract void calculateSalary();
    public abstract String getRole();

    void displayDetails() {
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class Manager extends Employee {

    int salary;
    String role;

    Manager(String name, int id, int salary, String role) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.role = role;
        calculateSalary();
    }
    
    @Override
    public void calculateSalary() {
        int bonus = (salary / 100) * 5;
        salary += bonus;
    }
    
    @Override
    public String getRole() {
        return role;
    }
    
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: " + getRole());
        System.out.println("Salary: " + salary + "PKR");
    }
}

class Developer extends Employee {

    int hoursWorked;
    String role;
    int salary;
    
    Developer(String name, int id, int hoursWorked, String role) {
        this.name = name;
        this.id = id;
        this.hoursWorked = hoursWorked;
        this.role = role;
        calculateSalary();
    }
    
    @Override
    public void calculateSalary() {
        int hourlyRate = 750;
        salary = hoursWorked * hourlyRate;
    }
    
    @Override
    public String getRole() {
        return role;
    }
    
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: " + getRole());
        System.out.println("Salary: " + salary + "PKR");
    }
}

public class task5 {
    public static void main(String[] args) {

        Manager s1 = new Manager("Syed Fahad Ali",101250,50000, "Manager");
        s1.displayDetails();

        Developer d1 = new Developer("Wasay", 10022, 40, "Developer");
        d1.displayDetails();

    }
}
