package labsession9;
import java.util.Scanner;

class InvalidCardException extends Exception {
    public InvalidCardException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class PaymentNetworkException extends Exception {
    public PaymentNetworkException(String message) {
        super(message);
    }
}

interface PaymentMethod {
    void processPayment(double amount) throws Exception;
}

class PayPal implements PaymentMethod {

    private double paypalBalance = 500; 

    @Override
    public void processPayment(double amount) throws InsufficientFundsException {
        if(amount > paypalBalance) {
            throw new InsufficientFundsException("Insfficent Funds in the account");
        } else {
            System.out.println("Successfully transfer the amount: ");
        }
    }
}

class CreditCard implements PaymentMethod {

    private double creditCardNumber = 3456654;

    @Override
    public void processPayment(double cardNumber) throws InvalidCardException {
        if(cardNumber == creditCardNumber) {
            System.out.println("Successfull access to account: ");
        } else {
            throw new InvalidCardException("Your card Number is wrong");
        }
    }
}

class BankTransfer implements PaymentMethod {

    private double bankAccountNumber;

    @Override
    public void processPayment(double accountNumber) throws PaymentNetworkException {
        if(bankAccountNumber == accountNumber ) {
            System.out.println("Successfull access to account: ");
        } else {
            throw new PaymentNetworkException("Network issue try again later");
        }
    }
}

public class task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int userChioce;
        
        PayPal paypalMethod = new PayPal();
        CreditCard creditCardMethod = new CreditCard();
        BankTransfer bankTransferMethod = new BankTransfer();

        System.out.println("Choose one Method:- ");
        System.out.println("1.Paypal Transfer ");
        System.out.println("2.Credit Card Transfer ");
        System.out.println("3.Bank Transfer ");
        userChioce = input.nextInt();

        try {
            switch (userChioce) {
                case 1:
                    try {
                        System.out.println("Enter your amount to transfer via paypal: ");
                        double paypalAccountNumber = input.nextDouble();
                        paypalMethod.processPayment(paypalAccountNumber);
                    } catch(Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Enter your credit card Number: ");
                        double creditcardNumber = input.nextDouble();
                        creditCardMethod.processPayment(creditcardNumber);
                    } catch(Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Enter your bank account Number: ");
                        double bankAccountNumber = input.nextDouble();
                        bankTransferMethod.processPayment(bankAccountNumber);
                    } catch(Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    break;
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}