import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.*;

public class task2 extends Application {

    @Override
    public void start(Stage stage) {

        TextField name = new TextField();
        TextField email = new TextField();
        ComboBox<String> status = new ComboBox<>();
        status.getItems().addAll("Present", "Absent");

        Button save = new Button("Save");

        save.setOnAction(e -> {
            try (FileWriter fw = new FileWriter("attendance.txt", true)) {
                fw.write(name.getText() + "," + email.getText() + "," + status.getValue() + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        VBox root = new VBox(10, name, email, status, save);
        root.setStyle("-fx-padding:20;");

        stage.setScene(new Scene(root, 300, 250));
        stage.setTitle("Attendance");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
