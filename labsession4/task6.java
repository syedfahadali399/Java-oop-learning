package labsession4;

class Customer {
    protected double balance;

    public Customer() {
        balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        }
    }
}

class VIPCustomer extends Customer {
    @Override
    protected void setBalance(double amount) {
        balance = amount;
    }
}

class Test {
    public static void main(String[] args) {
        Customer c = new Customer();
        System.out.println("Initial Customer balance: " + c.getBalance());

        c.setBalance(100.0);
        System.out.println("Customer balance after setting 100: " + c.getBalance());

        c.setBalance(-50.0);
        System.out.println("Customer balance after attempting to set -50: " + c.getBalance());

        VIPCustomer v = new VIPCustomer();
        System.out.println("Initial VIP balance: " + v.getBalance());

        v.setBalance(-100.0);
        System.out.println("VIP balance after setting -100: " + v.getBalance());

        // Not allowed: direct access to private field
        // c.balance = 200.0;
        // System.out.println(c.balance);
    }
}