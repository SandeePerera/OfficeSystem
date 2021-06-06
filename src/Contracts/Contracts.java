package Contracts;


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

public class Contracts {



        @FXML
        private javafx.scene.control.Button btnAddCon;
        @FXML
        private javafx.scene.control.Button btnViewCon;
        @FXML
        private javafx.scene.control.Button btnUpdate;
        @FXML
        private javafx.scene.control.Button btnDelete;
        @FXML
        private javafx.scene.control.Button btnCancel;
        @FXML
        private Text ConDetails;



        public void AddContracts(ActionEvent event){
            Stage stage=new Stage();

            try {
                Parent root = FXMLLoader.load(getClass().getResource("../Contracts/AddContracts.fxml"));
                Scene scene=new Scene(root);
                stage.setScene(scene);

                stage.initStyle(StageStyle.UNDECORATED);
                ((Node)event.getSource()).getScene().getWindow().hide();
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

        public void UpdateContract(ActionEvent event){
            Stage stage=new Stage();

            try {
                Parent root = FXMLLoader.load(getClass().getResource("../Contracts/Update.fxml"));
                Scene scene=new Scene(root);
                stage.setScene(scene);

                stage.initStyle(StageStyle.UNDECORATED);
                ((Node)event.getSource()).getScene().getWindow().hide();
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

        public void DeleteContract(ActionEvent event){
            Stage stage=new Stage();

            try {
                Parent root = FXMLLoader.load(getClass().getResource("../Contracts/Delete.fxml"));
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


    }


