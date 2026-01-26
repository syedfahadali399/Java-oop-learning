package labsession6;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void EmployeeDetail() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }

    double calculateSalary() {
        return salary;
    }
}

class FullTimeEmployee extends Employee {
    
    int monthlySalary;
    
    FullTimeEmployee(Employee employee, int monthlySalary) {
        super(employee.name, employee.id);
        this.monthlySalary = monthlySalary;
    }
    
    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    int hourlySalary;
    int perHour = 1500;

    PartTimeEmployee(Employee employee, int hourlySalary) {
        super(employee.name, employee.id);
        this.hourlySalary = hourlySalary;
    }

    @Override
    double calculateSalary() {
        return hourlySalary * perHour;
    }
}

class ContractEmployee extends Employee {

    int dailyNumberOfDay;
    int dailyRate = 1500;

    ContractEmployee(Employee employee, int dailyNumberOfDay) {
        super(employee.name, employee.id);
        this.dailyNumberOfDay = dailyNumberOfDay;
    }

    @Override
    double calculateSalary() {
        return dailyRate * dailyNumberOfDay;
    }
}

public class task4 {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Fahad", 101);
        Employee employee2 = new Employee("Anas", 102);
        Employee employee3 = new Employee("Muneeb", 103);

        FullTimeEmployee e1 = new FullTimeEmployee(employee1, 50000);
        employee1.EmployeeDetail();
        System.out.println("Full Time Employee Salary is " + e1.calculateSalary() + "PKR");
        System.out.println();

        PartTimeEmployee e2 = new PartTimeEmployee(employee2, 8);
        employee2.EmployeeDetail();
        System.out.println("Part Time Employee Salary is " + e2.calculateSalary() + "PKR");
        System.out.println();

        ContractEmployee e3 = new ContractEmployee(employee3, 21);
        employee2.EmployeeDetail();
        System.out.println("Contract Base Employee Salary is " + e3.calculateSalary() + "PKR");
    }
}