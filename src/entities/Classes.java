package entities;

import java.awt.*;

public class Classes {
    Integer id;
    String name;
    String room;
    Button edit;

    public Classes(String name, String room) {
        this.name = name;
        this.room = room;
        this.edit = new Button("Edit");


    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Button getEdit() {
        return edit;
    }

    public void setEdit(Button edit) {
        this.edit = edit;
    }
}
