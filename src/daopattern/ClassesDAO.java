package daopattern;

import database.Database;
import entities.Classes;
import javafx.scene.control.Alert;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ClassesDAO implements DAOInterface<Classes> {
    private static ClassesDAO instance;

    private ClassesDAO() {

    }

    public static ClassesDAO getInstance() throws Exception {
        if (instance == null)
            instance = new ClassesDAO();
        return instance;
    }

    public ArrayList<Classes> getALL() {
        ArrayList<Classes> list = new ArrayList<>();
        try {
            Database db = Database.getInstance();
            Statement stt = db.getStatement();
            String sql = "select * from lophoc";
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                String room = rs.getString("room");
                Classes c = new Classes(id, name, room);
                list.add(c);
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
        return list;
    }

    @Override
    public ArrayList<Classes> getAll() {
        return null;
    }

    public boolean create(Classes classes) {
        try {
            Database db = Database.getInstance();
            Statement stt = db.getStatement();
            String sql = "insert into lophoc(name,room) values('" + classes.getName() + "','" + classes.getRoom() + "')";
            if (stt.executeUpdate(sql) > 0) {
                return true;
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
        return false;
    }

    public boolean update(Classes classes) {
        try {
            Database db = Database.getInstance();
            Statement stt = db.getStatement();
            String sql = "update lophoc set name='" + classes.getName() + "', room='" + classes.getRoom() + "' where id = " + classes.getId();
            if (stt.executeUpdate(sql) > 0) {
                return true;
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
        return false;
    }

    public boolean delete(Classes classes) {
        try {
            Database db = Database.getInstance();
            Statement stt = db.getStatement();
            String sql = "delete from lophoc where id = " + classes.getId();
            if (stt.executeUpdate(sql) > 0) {
                return true;
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
        return false;
    }
    public Classes find(Integer id){
        try {
            Database db = Database.getInstance();
            Statement stt = db.getStatement();
            String sql = "select * from lophoc where id="+id;
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("name");
                String room = rs.getString("room");
                Classes c = new Classes(id, name, room);
                return c;
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
        return null;
    }
    //generic method
    public <N> Classes findOne(N id){
        return null;
    }
}

