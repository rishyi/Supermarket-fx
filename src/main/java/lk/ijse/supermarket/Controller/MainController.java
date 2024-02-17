package lk.ijse.supermarket.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private AnchorPane centerNode;

    @FXML
    private AnchorPane root;

    public void initialize() throws IOException {
        loadDashboard();
    }

    private void loadDashboard() throws IOException{
       AnchorPane dashboardPane = FXMLLoader.load(this.getClass().getResource("/view/dashboard.fxml"));

       centerNode.getChildren().clear();
       centerNode.getChildren().add(dashboardPane);
    }

    @FXML
    void btnCustomer(ActionEvent event) throws IOException {
        AnchorPane customerPane = FXMLLoader.load(this.getClass().getResource("/view/customer.fxml"));
        centerNode.getChildren().clear();
        centerNode.getChildren().add(customerPane);

    }

    @FXML
    void btnDashBoard(ActionEvent event) throws IOException{
        AnchorPane dashPane = FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"));
        centerNode.getChildren().clear();
        centerNode.getChildren().add(dashPane);

    }

    @FXML
    void btnItem(ActionEvent event) throws IOException{
        AnchorPane itemPane = FXMLLoader.load(getClass().getResource("/view/item.fxml"));
        centerNode.getChildren().clear();
        centerNode.getChildren().add(itemPane);

    }

    @FXML
    void btnLogOut(ActionEvent event) throws IOException{
        AnchorPane logout = FXMLLoader.load(getClass().getResource("/view/login.fxml"));
        Scene scene = new Scene(logout);
        Stage stage = (Stage) this.root.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
    }

}
