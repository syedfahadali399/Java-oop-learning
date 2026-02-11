package labsession9;

class InsufficentFundsException extends Exception {
    public InsufficentFundsException(String message) {
        super(message);
    }
}

class BankAccounts {

    private double balance;

    public void deposit(double amount) throws IllegalArgumentException {

        if (amount < 0) {
            throw new IllegalArgumentException("Negative amount");
        }
        
        balance += amount;
        
    }
    
    public void withdraw(double amount) throws InsufficentFundsException {
        
        if (amount > balance) {
            throw new InsufficentFundsException("Insufficent balance");
        
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class task1 {
    public static void main(String[] args) {
        BankAccounts myAccount = new BankAccounts();

        try {
            myAccount.deposit(4000);

            myAccount.withdraw(3000);

            myAccount.withdraw(2000);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Your balance is " + myAccount.getBalance());
        }
    }
}