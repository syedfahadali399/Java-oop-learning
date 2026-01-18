package labsession5;
import java.util.*;

public class task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] temp = new int[7];
        int totalTemp = 0;
        int avgTemp = 0;
        
        for (int i = 0; i < temp.length; i++) {
            
            System.out.println("Enter " + (i + 1) + " Day Temprature");
            int askUser = input.nextInt();  
            temp[i] = askUser;
            
        }
        
        int highTemp = temp[0];
        int lowTemp = temp[0];
        
        for (int i = 0; i < temp.length; i++) {

            totalTemp += temp[i];
            avgTemp = totalTemp / temp.length;

            if (temp[i] > highTemp) {
                highTemp = temp[i];
            }

            if (temp[i] < lowTemp) {
                lowTemp = temp[i];
            }

            System.out.println((i + 1) + " Day Temprature " + temp[i] + "C");
        }

        System.out.println("The average Temprature of 7 Days is " + avgTemp);
        System.out.println("The Highest Temprature in 7 Days is " + highTemp);
        System.out.println("The Lowest Temprature in 7 Days is " + lowTemp);

        input.close();
    }
}