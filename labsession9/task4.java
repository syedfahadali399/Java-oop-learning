package labsession9;

class insufficentFundsException extends Exception {
    public insufficentFundsException(String message) {
        super(message);
    }
}

class BankAccount {

    double balance = 4000;
    
    public void withdraw(double amount) throws insufficentFundsException {
        
        if (amount > balance) {
            throw new insufficentFundsException("Insufficent balance");
        } else {
            System.out.println("Successfully withdraw");
            balance -= amount;
        }
    }
}


public class task4 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        try {
            myAccount.withdraw(3000);
            myAccount.withdraw(2000);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
