package labsession9;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter numeric values only.");

        } finally {
            scanner.close();
        }
    }
}
