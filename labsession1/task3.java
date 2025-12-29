package labsession1;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your product price: ");
        float productPrice = input.nextFloat();

        System.out.println("Enter your discount percentage: ");
        float discount = input.nextFloat();

        float totalDiscount = (productPrice * discount) / 100;
        float totalAmount = productPrice - totalDiscount;

        System.out.print("The amount of your product after discount is " + totalAmount);

        input.close();
    }
}
