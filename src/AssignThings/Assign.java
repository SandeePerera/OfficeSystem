package AssignThings;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Assign {

    @FXML
    private javafx.scene.control.Button btnAssignRole;
    @FXML
    private javafx.scene.control.Button btnAssignProjectLeder;
    @FXML
    private javafx.scene.control.Button btnAssignWork;
    @FXML
    private javafx.scene.control.Button btnBack;
    @FXML
    private Text Details;


    public void AssignRole(ActionEvent event) {
        Stage stage = new Stage();

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../AssignThings/AssignRole.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);

            stage.initStyle(StageStyle.UNDECORATED);
            ((Node) event.getSource()).getScene().getWindow().hide();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void AssignProjectLeder(ActionEvent event) {
        Stage stage = new Stage();

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../AssignThings/AssignProjectLeder.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);

            stage.initStyle(StageStyle.UNDECORATED);
            ((Node) event.getSource()).getScene().getWindow().hide();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void AssignWork(ActionEvent event) {
        Stage stage = new Stage();

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../AssignThings/AssignWork.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);

            stage.initStyle(StageStyle.UNDECORATED);
            ((Node) event.getSource()).getScene().getWindow().hide();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void back(ActionEvent event) {
        Stage stage = new Stage();

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../MainMenu/mainscreen.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);

            stage.initStyle(StageStyle.UNDECORATED);
            ((Node) event.getSource()).getScene().getWindow().hide();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}










