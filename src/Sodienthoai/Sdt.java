package Sodienthoai;

import javafx.scene.control.Button;

import java.awt.*;

public class Sdt {
    String ten;
    String sodienthoai;
    Button edit;

    public Sdt(String ten,String sodienthoai) {
        this.ten = ten;
        this.sodienthoai = sodienthoai;
        this.edit = new Button("Edit");
        this.edit.setOnAction(event -> {
            Sodienthoai.editSdt = this;
            Sodienthoai.stTen.setText(this.ten);
            Sodienthoai.stSodienthoai.setText(this.sodienthoai);
        });
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }
    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
    public String toString(){
        return this.ten+"--"+this.sodienthoai;
    }

    public Button getEdit() {
        return edit;
    }

    public void setEdit(Button edit) {
        this.edit = edit;
    }
}
