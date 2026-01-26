package labsession6;

class BankAccount {
    String accountNumber;
    double balance;
    String ownerName;
    
    BankAccount(String accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }
    
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " PKR");
            System.out.println("New Balance: " + balance + " PKR");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " PKR");
            System.out.println("Remaining Balance: " + balance + " PKR");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Available: " + balance + " PKR");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    
    void applyInterest() {
        System.out.println("No interest applicable for basic account");
    }
    
    void displayAccountInfo() {
        System.out.println("\n--- Account Information ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Current Balance: " + balance + " PKR");
    }
}

class SavingsAccount extends BankAccount {

    double annualInterestRate;
    
    SavingsAccount(String accountNumber, double balance, String ownerName, double annualInterestRate) {
        super(accountNumber, balance, ownerName);
        this.annualInterestRate = annualInterestRate;
    }
    
    @Override
    void applyInterest() {
        double interest = balance * (annualInterestRate / 100);
        balance += interest;
        System.out.println("Interest Applied: " + interest + " PKR at " + annualInterestRate + "% annual rate");
        System.out.println("New Balance: " + balance + " PKR");
    }
    
    @Override
    void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Savings Account");
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double overdraftLimit;
    
    CheckingAccount(String accountNumber, double balance, String ownerName, double overdraftLimit) {
        super(accountNumber, balance, ownerName);
        this.overdraftLimit = overdraftLimit;
    }
    
    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= (balance + overdraftLimit)) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " PKR");
            System.out.println("Remaining Balance: " + balance + " PKR");
            if (balance < 0) {
                System.out.println("WARNING: Overdraft used! Amount: " + Math.abs(balance) + " PKR");
            }
        } else if (amount > (balance + overdraftLimit)) {
            System.out.println("Exceeds overdraft limit! Available (including overdraft): " + (balance + overdraftLimit) + " PKR");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    
    @Override
    void applyInterest() {
        System.out.println("No interest applicable for Checking Account");
    }
    
    @Override
    void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Checking Account");
        System.out.println("Overdraft Limit: " + overdraftLimit + " PKR");
        System.out.println("Available (with overdraft): " + (balance + overdraftLimit) + " PKR");
    }
}

class BusinessAccount extends BankAccount {

    double businessInterestRate;
    double withdrawalLimit;
    
    BusinessAccount(String accountNumber, double balance, String ownerName, double businessInterestRate, double withdrawalLimit) {
        super(accountNumber, balance, ownerName);
        this.businessInterestRate = businessInterestRate;
        this.withdrawalLimit = withdrawalLimit;
    }
    
    @Override
    void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal exceeds business account limit of " + withdrawalLimit + " PKR");
            return;
        }
        super.withdraw(amount);
    }
    
    @Override
    void applyInterest() {
        double interest = balance * (businessInterestRate / 100);
        balance += interest;
        System.out.println("Business Interest Applied: " + interest + " PKR at " + businessInterestRate + "% rate");
        System.out.println("New Balance: " + balance + " PKR");
    }
    
    @Override
    void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Business Account");
        System.out.println("Business Interest Rate: " + businessInterestRate + "%");
        System.out.println("Withdrawal Limit: " + withdrawalLimit + " PKR");
    }
}

public class task6 {
    public static void main(String[] args) {
        
        SavingsAccount savings = new SavingsAccount("SA-001", 50000, "Ali Ahmed", 5.0);
        savings.displayAccountInfo();
        System.out.println("\n--- Transactions ---");
        savings.deposit(10000);
        savings.withdraw(5000);
        savings.applyInterest();
        
        System.out.println();
        
        CheckingAccount checking = new CheckingAccount("CA-002", 20000, "Syed Fahad Ali", 5000);
        checking.displayAccountInfo();
        System.out.println("\n--- Transactions ---");
        checking.deposit(5000);
        checking.withdraw(28000);
        checking.applyInterest();
        
        System.out.println();
        
        BusinessAccount business = new BusinessAccount("BA-003", 100000, "Tech Solutions Ltd", 7.0, 50000);
        business.displayAccountInfo();
        System.out.println("\n--- Transactions ---");
        business.deposit(25000);
        business.withdraw(40000);
        business.withdraw(60000);
        business.applyInterest();
        
        System.out.println();
        
        System.out.println("\nFINAL BALANCES");
        System.out.println("Savings Account (Ali Ahmed): " + savings.balance + " PKR");
        System.out.println("Checking Account (Syed Fahad Ali): " + checking.balance + " PKR");
        System.out.println("Business Account (Tech Solutions Ltd): " + business.balance + " PKR");
    }
}