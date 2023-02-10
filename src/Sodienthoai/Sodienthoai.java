package Sodienthoai;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.*;

public class Sodienthoai implements Initializable {
    public TextField txtTen;
    public TextField txtSodienthoai;

    public static TextField stTen;
    public static TextField stSodienthoai;

    public ObservableList<Sdt> listSdt = FXCollections.observableArrayList();

    public static Sdt editSdt;
    public TableView<Sdt> tbview;
    public TableColumn<Sdt, String> cName;
    public TableColumn<Sdt, String> cPhone;
    public TableColumn<Sdt, Button> cAction;




    public void submit(ActionEvent actionEvent) {
        String t = txtTen.getText();
        String sdt = txtSodienthoai.getText();

        if (editSdt == null) {
            Sdt s = new Sdt(t, sdt);
            listSdt.add(s);


        } else {
            for (Sdt s : listSdt) {
                if (s.sodienthoai.equals(editSdt.sodienthoai)
                        && s.ten.equals(editSdt.ten)) {
                    s.setTen(t);
                    s.setSodienthoai(sdt);
                }
            }

        }
        tbview.setItems((ObservableList<Sdt>) listSdt);
        tbview.refresh();
        editSdt = null;
        clearInput();
        sort();
    }


    void clearInput() {
        txtSodienthoai.clear();
        txtTen.clear();
    }


    public void edit(MouseEvent mouseEvent) {

        txtTen.setText(editSdt.getTen());
        txtSodienthoai.setText(editSdt.getSodienthoai());
    }

    public void sort() {
        Collections.sort(listSdt, new Comparator<Sdt>() {
            @Override
            public int compare(Sdt o1, Sdt o2) {
                return o1.ten.compareTo(o2.ten);
            }
        });
//        public void sort() {
//            Collections.sort(listSdt, new Comparator<Sodienthoai.Sodienthoai.Sdt>() {
//                @Override
//                public int compare(Sodienthoai.Sodienthoai.Sdt o1, Sodienthoai.Sodienthoai.Sdt o2) {
//                    return o2.ten.compareTo(o1.ten);
//                }
//            });
//   }
        }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cName.setCellValueFactory(new PropertyValueFactory<>("ten"));
        cPhone.setCellValueFactory(new PropertyValueFactory<>("sodienthoai"));
        cAction.setCellValueFactory(new PropertyValueFactory<>("edit"));


        stTen = txtTen;
        stSodienthoai = txtSodienthoai;
    }
}




