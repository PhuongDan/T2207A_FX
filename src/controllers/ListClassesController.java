package controllers;

import entities.Classes;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ListClassesController {
    public static Classes editClasses;
    public TableView<Classes> tbviewcl;
    public TableColumn<Classes,String> cName;
    public TableColumn<Classes,String> cRoom;
    public TableColumn<Classes, Button> cAction;


    public void goToHome(ActionEvent actionEvent)throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../resources/home.fxml"));
        HomeController.rootStage.setScene(new Scene(root,600,400));
    }

    public void goToCreate(ActionEvent actionEvent)throws Exception { Parent root = FXMLLoader.load(getClass().getResource("../resources/classes/create.fxml"));
        HomeController.rootStage.setScene(new Scene(root,600,400));
    }
}
