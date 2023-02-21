package controllers;

import daopattern.ClassesDAO;
import database.Database;
import entities.Classes;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ListClassesController implements Initializable {
    public TableView<Classes> tbviewcl;
    public TableColumn<Classes,Integer> cID;
    public TableColumn<Classes,String> cName;
    public TableColumn<Classes,String> cRoom;



    public void goToHome(ActionEvent actionEvent)throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../resources/home.fxml"));
        HomeController.rootStage.setScene(new Scene(root,600,400));
    }

    public void goToCreate(ActionEvent actionEvent)throws Exception { Parent root = FXMLLoader.load(getClass().getResource("../resources/classes/create.fxml"));
        HomeController.rootStage.setScene(new Scene(root,600,400));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        cID.setCellValueFactory(new PropertyValueFactory<>("id"));
        cName.setCellValueFactory(new PropertyValueFactory<>("name"));
        cRoom.setCellValueFactory(new PropertyValueFactory<>("room"));
        ClassesDAO cd = null;
        try {
            cd = ClassesDAO.getInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        ArrayList<Classes> dslh = cd.getALL();
        tbviewcl.getItems().addAll(dslh);
        tbviewcl.refresh();
    }



    }

