package Customer;

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

public class Customer {

    @FXML
    private javafx.scene.control.Button btnAddCust;
    @FXML
    private javafx.scene.control.Button btnViewCust;
    @FXML
    private javafx.scene.control.Button btnUpdate;
    @FXML
    private javafx.scene.control.Button btnDelete;
    @FXML
    private javafx.scene.control.Button btnSubmit;
    @FXML
    private javafx.scene.control.Button btnCancel;
    @FXML
    private Text CustDetails;



    public void AddCustomer(ActionEvent event){
        Stage stage=new Stage();

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../Customer/AddCustomer.fxml"));
            Scene scene=new Scene(root);
            stage.setScene(scene);

            stage.initStyle(StageStyle.UNDECORATED);
            ((Node)event.getSource()).getScene().getWindow().hide();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void UpdateCustomer(ActionEvent event){
        Stage stage=new Stage();

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../Customer/Update.fxml"));
            Scene scene=new Scene(root);
            stage.setScene(scene);

            stage.initStyle(StageStyle.UNDECORATED);
            ((Node)event.getSource()).getScene().getWindow().hide();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void DeleteCustomer(ActionEvent event){
        Stage stage=new Stage();

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../Customer/Delete.fxml"));
            Scene scene=new Scene(root);
            stage.setScene(scene);

            stage.initStyle(StageStyle.UNDECORATED);
            ((Node)event.getSource()).getScene().getWindow().hide();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void ok(ActionEvent event){
        Stage stage=new Stage();

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../MainMenu/mainscreen.fxml"));
            Scene scene=new Scene(root);
            stage.setScene(scene);

            stage.initStyle(StageStyle.UNDECORATED);
            ((Node)event.getSource()).getScene().getWindow().hide();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    public void back(ActionEvent event){
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


}

