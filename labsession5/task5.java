package labsession5;
import java.util.Random;

public class task5 {
    public static void main(String[] args) {

        int[] productStock = new int[5];
        Random number = new Random();

        for(int i = 0; i < productStock.length; i++) {
            productStock[i] = number.nextInt(101);
        }

        findSecondSmallestStock(productStock);
    }

    static void findSecondSmallestStock(int[] stocks) {

        int largestStock = stocks[0];
        int smallestStock = stocks[0];
        int secondSmallestStock = stocks[0];
        boolean value = false;
        String message = "";

        System.out.println();
        for(int i = 0; i < stocks.length; i++) {
            if(stocks[i] > largestStock) {
                largestStock = stocks[i];
            }

            if(stocks[i] < smallestStock) {
                smallestStock = stocks[i];
            }

            System.out.println(stocks[i]);

        }

        for(int i = 0; i < stocks.length; i++) {
            if(stocks[i] > smallestStock && stocks[i] < secondSmallestStock) {
                secondSmallestStock = stocks[i];
            }

            for(int j = i + 1; j < stocks.length; j++) {
                if(secondSmallestStock == stocks[j]) {
                    value = true;
                    message = "Second Smallest Sales is not Found in data";
                }
            }
        }

        if(value) {
            System.out.println(message);
        } else {
            System.out.println("\nThe Second most smallest sales is " + secondSmallestStock);
        }
    }
}