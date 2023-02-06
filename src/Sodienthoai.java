import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Sodienthoai {
    public TextField txtTen;
    public TextField txtSodienthoai;

    public ObservableList<Sdt> listSdt = FXCollections.observableArrayList();
    public ListView<Sdt> lv;
    public Sdt editSdt;


    public void submit(ActionEvent actionEvent) {
        String t = txtTen.getText();
        String sdt = txtSodienthoai.getText();

        if (editSdt == null) {
            Sdt s = new Sdt(t, sdt);
            listSdt.add(s);
            lv.setItems(listSdt);
        } else {
            for (Sdt s : listSdt) {
                if (s.sodienthoai.equals(editSdt.ten)) {
                    s.setTen(t);
                    s.setSodienthoai(sdt);
                    editSdt = null;
                }
            }

        }
        Sdt s = new Sdt(t, sdt);
        lv.setItems((ObservableList<Sdt>) listSdt);
        lv.refresh();
        clearInput();
        sort();
    }


    void clearInput() {
        txtSodienthoai.clear();
        txtTen.clear();
    }


    public void edit(MouseEvent mouseEvent) {
        editSdt = lv.getSelectionModel().getSelectedItem();
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

    }
}



