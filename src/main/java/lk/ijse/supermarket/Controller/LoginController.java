package lk.ijse.supermarket.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.supermarket.db.Details;

import java.io.IOException;

public class LoginController {

    @FXML
    private AnchorPane rootNode;

    @FXML
    private TextField txtpassword;

    @FXML
    private TextField txtuserName;

    @FXML
    void btnLoginAction(ActionEvent event) throws IOException {
        String userName = txtuserName.getText();
        String password = txtpassword.getText();

        if (userName.equals(Details.name) && password.equals(Details.pw)){
            AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/main.fxml"));

            Scene scene = new Scene(rootNode);
            Stage stage = (Stage) this.rootNode.getScene().getWindow();
            stage.setScene(scene);

            stage.setTitle("Login Page");
            stage.centerOnScreen();
        }else {
            new Alert(Alert.AlertType.ERROR,"login Failll").show();
        }
    }

}
