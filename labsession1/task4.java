package labsession1;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        float result = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your operator: ");
        String operator = input.nextLine();

        System.out.println("Enter 1st number: ");
        float firstNumber = input.nextFloat();
        
        System.out.println("Enter 2nd Number: ");
        float secondNumber = input.nextFloat();

        if(operator.equals("+")) {
            result = firstNumber + secondNumber;
        } else if(operator.equals("-")) {
            result = firstNumber - secondNumber;
        } else if(operator.equals("*")) {
            result = firstNumber * secondNumber;
        } else if(operator.equals("/")) {
            result = firstNumber / secondNumber;
        } else {
            System.out.println("Enter correct operator");
        }
        
        System.out.println("The result of two num is " + result);
        input.close();
    }
}
