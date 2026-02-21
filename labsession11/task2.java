import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class task2 extends Application {

    @Override
    public void start(Stage stage) {

        Label title = new Label("User Information");

        TextField nameField = new TextField();
        nameField.setPromptText("Enter name");

        ComboBox<String> cityBox = new ComboBox<>();
        cityBox.getItems().addAll("Karachi", "Lahore", "Islamabad");

        DatePicker datePicker = new DatePicker();

        CheckBox email = new CheckBox("Email");
        CheckBox phone = new CheckBox("Phone");

        Button submit = new Button("Submit");
        Button cancel = new Button("Cancel");

        submit.setOnAction(e -> {
            System.out.println("Name: " + nameField.getText());
            System.out.println("City: " + cityBox.getValue());
            System.out.println("Date: " + datePicker.getValue());
            System.out.println("Email: " + email.isSelected());
            System.out.println("Phone: " + phone.isSelected());
        });

        cancel.setOnAction(e -> {
            nameField.clear();
            cityBox.setValue(null);
            datePicker.setValue(null);
            email.setSelected(false);
            phone.setSelected(false);
        });
        HBox buttons = new HBox(10, submit, cancel);
        VBox root = new VBox(10, title, nameField, cityBox, datePicker, email, phone, buttons);
        root.setStyle("-fx-padding: 20;");

        stage.setScene(new Scene(root, 350, 350));
        stage.setTitle("Form App");
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
