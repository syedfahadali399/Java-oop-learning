package labsession12;

import java.util.Scanner;
import java.io.*;

public class task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your Email Address: ");
        String emailAddress = input.nextLine();

        System.out.println("Enter your Phone Number: ");
        String phoneNumber = input.nextLine();

        File myFile = new File("data.txt");
        try {
            if(myFile.createNewFile()) {
                System.out.println("File is created " + myFile.getName());
            }

        } catch(Exception e) {

        }

        
    }
}
