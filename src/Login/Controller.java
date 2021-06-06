package Login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.IOException;



public class Controller {
    @FXML
    private TextField password;
    @FXML
    private TextField username;
    @FXML
    private javafx.scene.control.Button btnLogin;
    public static String userGreeting;

    @FXML

    public void validateInfo(ActionEvent evt) {
        String enteredUsername = username.getText();
        String enteredPassword = password.getText();

        if ((enteredUsername.equals("admin")) && (enteredPassword.equals("123"))) {
            try {
                userGreeting=enteredUsername;
                Parent rootNode = FXMLLoader.load(getClass().getResource("../MainMenu/mainscreen.fxml"));
                Scene sceneMainScreen = new Scene(rootNode, 600, 400);
                Stage stageMainScreen = new Stage();
                stageMainScreen.setScene(sceneMainScreen);
                stageMainScreen.setTitle("Main Menu");
                stageMainScreen.showAndWait();

            } catch (IOException e) {
                System.out.println("please check whether the file exists");
            }

            }else{
                Alert message = new Alert(Alert.AlertType.ERROR, "Incorrect User Name");
                message.showAndWait();
            }

        }
    }



