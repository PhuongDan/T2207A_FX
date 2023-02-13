package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ListStudentsController {
    public void goToHome(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../resources/home.fxml"));
        HomeController.rootStage.setScene(new Scene(root,600,400));
    }

    public void goToCreate(ActionEvent actionEvent)throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../resources/students/create.fxml"));
        HomeController.rootStage.setScene(new Scene(root,600,400));
    }
}
