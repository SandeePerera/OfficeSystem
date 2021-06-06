package Contracts;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class AddContracts {
    @FXML
    private TextField CId;
    @FXML
    private TextField cFname;
    @FXML
    private TextField cLname;
    @FXML
    private TextField JobType;
    @FXML
    private TextField Description;
    @FXML
    private TextField Year;
    @FXML
    private TextField Month;
    @FXML
    private TextField Date;
    @FXML
    private TextField contactNum;
    @FXML
    private javafx.scene.control.Button btnSubmit;
    @FXML
    private javafx.scene.control.Button btnCancel;
    @FXML
    private Text ConractorDetails;


    public void ok(ActionEvent event){
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
