package labsession5;
import java.util.*;

public class task2 {
    public static void main(String[] args) {

        double[][] product = new double[5][4];
        Random num = new Random();

        for(int i = 0; i < product.length; i++) {
            for(int j = 0; j < product[i].length; j++) {
            
                product[i][j] = num.nextInt(101);
            }
        }

        for (int i = 0; i < product.length; i++) {
            System.out.println("Product " + (i + 1) + ":");

            for (int j = 0; j < product[i].length; j++) {
                System.out.println("  Branch " + (j + 1) + ": " + product[i][j]);
            }
            System.out.println("");
        }

        int highestStock = -1;
        int highestProduct = -1;
        System.out.println("Total Stock per Product");

        for (int i = 0; i < product.length; i++) {

            int total = 0;
            for (int j = 0; j < product[i].length; j++) {
                total += product[i][j];
            }

            System.out.println("Product " + (i + 1) + " Total Stock: " + total);

            if (total > highestStock) {
                highestStock = total;
                highestProduct = i;
            }
        }

        System.out.println("\nProduct with the Highest Stock: Product " + (highestProduct + 1));
        System.out.println("Total Stock: " + highestStock);
    }
}