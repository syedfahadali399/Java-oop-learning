package labsession5;
import java.util.*;

public class task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] sales = new int[7];
        
        for (int i = 0; i < sales.length; i++) {
            System.out.println("Enter " + (i + 1) + " Day Sales");
            int salesNumber = input.nextInt();
            
            sales[i] = salesNumber;
        }
        
        findSecondLargest(sales);
        
        input.close();
    }

    static void findSecondLargest(int[] sales) {

        int highestSales = sales[0];
        int secondLargest = sales[0];
        String noFound = "";
        boolean value = false;

        for(int i = 0; i < sales.length; i++) {
            if(sales[i] > highestSales) {
                highestSales = sales[i];
            }
        }

        for(int i = 0; i < sales.length; i++) {

            if(sales[i] < highestSales && sales[i] > secondLargest) {
                secondLargest = sales[i];
            } 
            
            for(int j = i + 1; j < sales.length; j++) {
                if(secondLargest == sales[j]) {
                    noFound = "\nNo Second Largest sales is found in data";
                    value = true;
                }
            }
        }

        if(value) {
            System.out.println(noFound);
        } else {
            System.out.println("\nThe Second Largest Sales is " + secondLargest);
        }
        
    }
}