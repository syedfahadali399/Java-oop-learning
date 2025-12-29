package labsession1;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println(
            "Welcome! " + firstName + " " + lastName + " your age is " + age );

        input.close();
    }
}
