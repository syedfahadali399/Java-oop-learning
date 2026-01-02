package labsession2;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int studentMarks;

        System.out.println("Enter your exam marks: ");
        studentMarks = input.nextInt();

        if(studentMarks >= 50) {
            System.out.println("you passed in the exam!");
        } else {
            System.out.println("you fail in the exam");
        }

        input.close();

    }
}

