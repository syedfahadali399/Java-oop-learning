package labsession1;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your monday running day distance: ");
        double monday = input.nextDouble();
        
        System.out.println("Enter your thuesday running day distance: ");
        double thuesday = input.nextDouble();
        
        System.out.println("Enter your wednesday running day distance: ");
        double wednesday = input.nextDouble();
        
        System.out.println("Enter your thursday running day distance: ");
        double thursday = input.nextDouble();
        
        System.out.println("Enter your friday running day distance: ");
        double friday = input.nextDouble();
        
        System.out.println("Enter your saturday running day distance: ");
        double saturday = input.nextDouble();
        
        System.out.println("Enter your sunday running day distance: ");
        double sunday = input.nextDouble();
        
        double totalDistance = monday + thuesday + wednesday + thursday + friday + saturday + sunday;

        System.out.println("The user cover the distance in the whole week is " + totalDistance);

        input.close();
    }
}