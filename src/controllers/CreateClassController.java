package controllers;

import entities.Classes;
import entities.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateClassController implements Initializable {
    public static Classes editClasses;
    public TextField txtName;
    public TextField txtRoom;
    public  static TextField stName;
    public static TextField stRoom;
    public TableView<Classes> tbviewcl;
    public TableColumn<Classes,String> cName;
    public TableColumn<Classes,String> cRoom;
    public TableColumn<Classes, Button> cAction;
    public ObservableList<Classes> listClasses = FXCollections.observableArrayList();


    public void goToList(ActionEvent actionEvent) throws Exception  {
        Parent root = FXMLLoader.load(getClass().getResource("../resources/classes/list.fxml"));
        HomeController.rootStage.setScene(new Scene(root,600,400));
    }

    public void submit(ActionEvent actionEvent) {
        String n = txtName.getText();
        String r = txtRoom.getText();

        if (editClasses == null){
            Classes C = new Classes(n,r);
            listClasses.add(C);

        }else {
            for (Classes C : listClasses) {
                if (C.getRoom().equals(editClasses.getRoom())
                        && C.getName().equals(editClasses.getName())) {
                    C.setName(n);
                    C.setRoom(r);
                }

            }
        }


        tbviewcl.setItems((ObservableList<Classes>) listClasses);
        tbviewcl.refresh();
        editClasses = null;
        clearInput();
    }

    void clearInput(){
        txtRoom.clear();
        txtName.clear();
    }
    public void edit(MouseEvent mouseEvent) {
        txtName.setText(editClasses.getName());
        txtRoom.setText(editClasses.getRoom());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cName.setCellValueFactory(new PropertyValueFactory<>("name"));
        cRoom.setCellValueFactory(new PropertyValueFactory<>("room"));
        cAction.setCellValueFactory(new PropertyValueFactory<>("edit"));

        stName = txtName;
        stRoom = txtRoom;
    }
}



