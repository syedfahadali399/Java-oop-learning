package labsession6;

class Person {

    protected String name;
    protected int phoneNumber;
    protected String address;
    protected String emailAddress;

    public Person(String name, int phoneNumber, String address, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}

class Employee extends Person {

    protected int salary;
    protected String dateOfHiring;

    public Employee(String name, int phoneNumber, String address, String emailAddress, int salary, String dateOfHiring) {
        super(name, phoneNumber, address, emailAddress);
        this.salary = salary;
        this.dateOfHiring = dateOfHiring;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", salary=" + salary +
                ", dateOfHiring='" + dateOfHiring + '\'' +
                '}';
    }
}

class Faculty extends Employee {

    protected int officeHour;
    protected String rank;

    public Faculty(String name, int phoneNumber, String address, String emailAddress, int salary, String dateOfHiring, int officeHour, String rank) {
        super(name, phoneNumber, address, emailAddress, salary, dateOfHiring);
        this.officeHour = officeHour;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", salary=" + salary +
                ", dateOfHiring='" + dateOfHiring + '\'' +
                ", officeHour=" + officeHour +
                ", rank='" + rank + '\'' +
                '}';
    }
}

public class task2 {
    public static void main(String[] args) {

        Person person = new Person("John Doe", 1234567890, "123 Main St", "john.doe@example.com");
        System.out.println("Person Details:");
        System.out.println(person.toString());
        System.out.println();

        Employee employee = new Employee("Jane Smith", 987654321, "456 Elm St", "jane.smith@example.com", 50000, "2020-01-15");
        System.out.println("Employee Details:");
        System.out.println(employee.toString());
        System.out.println();

        Faculty faculty = new Faculty("Dr. Alice Johnson", 555123456, "789 Oak St", "alice.johnson@university.edu", 75000, "2015-08-20", 10, "Professor");
        System.out.println("Faculty Details:");
        System.out.println(faculty.toString());
    }
}