import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class task1 extends Application {

    @Override
    public void start(Stage stage) {

        // Title Label
        Label titleLabel = new Label("User Information Form");

        // Text Field
        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name");

        // ComboBox for City
        ComboBox<String> cityBox = new ComboBox<>();
        cityBox.getItems().addAll("Karachi", "Lahore", "Islamabad");
        cityBox.setPromptText("Select City");

        // Date Picker
        DatePicker datePicker = new DatePicker();

        // Buttons
        Button submitBtn = new Button("Submit");
        Button cancelBtn = new Button("Cancel");

        // HBox for Buttons
        HBox buttonBox = new HBox(10, submitBtn, cancelBtn);

        // VBox Layout
        VBox root = new VBox(10);
        root.getChildren().addAll(
                titleLabel,
                nameField,
                cityBox,
                datePicker,
                buttonBox
        );

        root.setStyle("-fx-padding: 20;");

        // Scene & Stage
        Scene scene = new Scene(root, 350, 300);
        stage.setTitle("Lab 11 - Task 1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
