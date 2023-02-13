package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sun.applet.Main;

public class HomeController {


    public static Stage rootStage;
    public void goToClasses(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../resources/classes/list.fxml"));
        HomeController.rootStage.setScene(new Scene(root,600,400));
    }

    public void goToStudents(ActionEvent actionEvent)throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../resources/students/list.fxml"));
        HomeController.rootStage.setScene(new Scene(root,600,400));
    }
}