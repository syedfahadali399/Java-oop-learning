package labsession9;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class task6 {

    public static void main(String[] args) {

        String filePath = "example.txt";

        try (FileReader reader = new FileReader(filePath)) {

            int character;

            System.out.println("File content:");

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
        catch (IOException e) {
            System.out.println("Error: Problem reading the file!");
        }
    }
}
