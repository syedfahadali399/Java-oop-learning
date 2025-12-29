package labsession1;
import java.util.Date;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println("Current Date and Time: " + currentDate);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        System.out.print("Enter an exponent: ");
        double exponent = input.nextDouble();

        double squareRoot = Math.sqrt(number);
        double sineValue = Math.sin(number);
        double cosineValue = Math.cos(number);
        double tangentValue = Math.tan(number);
        double powerValue = Math.pow(number, exponent);
        double randomValue = Math.random();

        System.out.printf("Square Root: %.3f\n", squareRoot);
        System.out.printf("Sine: %.4f\n", sineValue);
        System.out.printf("Cosine: %.4f\n", cosineValue);
        System.out.printf("Tangent: %.4f\n", tangentValue);
        System.out.printf("Power (%.1f ^ %.1f): %.3f\n", number, exponent, powerValue);
        System.out.printf("Random Number: %.5f\n", randomValue);

        input.close();

    }
}
