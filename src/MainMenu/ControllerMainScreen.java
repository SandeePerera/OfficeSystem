package MainMenu;

import Login.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ControllerMainScreen {
    @FXML
    private Label lblgreeting;

    public void initialize() {
        lblgreeting.setText("Welcome , " + Controller.userGreeting);
    }


    public void ManageEmployee(ActionEvent event){
        Stage stage=new Stage();

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../Employee/Employee.fxml"));
            Scene scene=new Scene(root);
            stage.setScene(scene);

            stage.initStyle(StageStyle.UNDECORATED);
            ((Node)event.getSource()).getScene().getWindow().hide();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public void ManageCustomer(ActionEvent event){
        Stage stage=new Stage();

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../Customer/Customer.fxml"));
            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UNDECORATED);
            ((Node)event.getSource()).getScene().getWindow().hide();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void ManageContracts(ActionEvent event){
        Stage stage=new Stage();

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../Contracts/Contracts.fxml"));
            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UNDECORATED);
            ((Node)event.getSource()).getScene().getWindow().hide();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void ManageRole(ActionEvent event){
        Stage stage=new Stage();

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../Role/Role.fxml"));
            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UNDECORATED);
            ((Node)event.getSource()).getScene().getWindow().hide();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void CalculatePayments(ActionEvent event){
        Stage stage=new Stage();

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../CalculatePayments/Calculations.fxml"));
            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UNDECORATED);
            ((Node)event.getSource()).getScene().getWindow().hide();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void AssignThings(ActionEvent event){
        Stage stage=new Stage();

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../AssignThings/Assign.fxml"));
            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UNDECORATED);
            ((Node)event.getSource()).getScene().getWindow().hide();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    }


