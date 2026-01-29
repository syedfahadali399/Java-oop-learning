package labsession7;

abstract class Account {
    protected String id;
    protected double balance;

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public abstract boolean withdraw(double amount);
    public abstract void deposit(double amount);

}

class SavingsAccount extends Account {

    double transactionsFees = 2;

    SavingsAccount(String id, double amount) {
        super(id, amount);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Your previous Balance is " + balance + "$");
        balance += amount;
        System.out.println("Your new Balance is " + balance + "$");
    }

    @Override 
    public boolean withdraw(double amount) {
        double detectFees = amount + transactionsFees;
        if(balance > 0) {
            double checkAmount = balance -= detectFees;
            if(checkAmount >= 10) {
                System.out.println("\nWithdraw amount " + amount + "$");
                System.out.println("Withdraw Fees " + transactionsFees + "$");
                System.out.println("After Withdraw your balance is " + balance + "$");
                return true;
            } else {
                System.out.println("Total balance must not be less than 10$");
                return false;
            }
        } else {
            System.out.println("Insufficent Balance");
            return false;
        }
    }
}

public class task1 {
    public static void main(String[] args) {
        SavingsAccount newAccount = new SavingsAccount("abc-1023", 10);

        newAccount.deposit(20);
        newAccount.withdraw(18);
    }
}