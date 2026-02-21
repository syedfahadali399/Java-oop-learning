
        import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
        import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class task3 extends Application {

    @Override
    public void start(Stage stage) {

        TextField username = new TextField();
        PasswordField password = new PasswordField();
        TextField email = new TextField();
        Label error = new Label();

        Button register = new Button("Register");

        VBox registerLayout = new VBox(10,
                new Label("Username"), username,
                new Label("Password"), password,
                new Label("Email"), email,
                error, register
        );
        registerLayout.setStyle("-fx-padding:20;");

        Scene registerScene = new Scene(registerLayout, 300, 300);

        Label profileUser = new Label();
        Label profileEmail = new Label();
        Button back = new Button("Back");

        VBox profileLayout = new VBox(10, profileUser, profileEmail, back);
        profileLayout.setStyle("-fx-padding:20;");

        Scene profileScene = new Scene(profileLayout, 300, 200);

        register.setOnAction(e -> {
            if (username.getText().isEmpty() || password.getText().isEmpty() || email.getText().isEmpty()) {
                error.setText("All fields required!");
            } else {
                profileUser.setText("Username: " + username.getText());
                profileEmail.setText("Email: " + email.getText());
                stage.setScene(profileScene);
            }
        });

        back.setOnAction(e -> stage.setScene(registerScene));

        stage.setScene(registerScene);
        stage.setTitle("Registration System");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
