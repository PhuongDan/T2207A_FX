package daopattern;

import entities.Classes;
import entities.Student;

import java.util.ArrayList;

public class StudentsDAO implements DAOInterface<Student> {
    @Override
    public ArrayList<Student> getAll() {
        return null;
    }

    @Override
    public boolean create(Student classes) {
        return false;
    }

    @Override
    public boolean update(Student classes) {
        return false;
    }

    @Override
    public boolean delete(Student classes) {
        return false;
    }

    @Override
    public Student find(Integer id) {
        return null;
    }
//    private static StudentsDAO instance;
//
//    private StudentsDAO(){
//
//    }
//    public static StudentsDAO getInstance() throws Exception {
//        if (instance == null)
//            instance = new StudentsDAO();
//        return instance;
//    }
//
//    public ArrayList<Student> getALL() {
//        ArrayList<Student> list = new ArrayList<>();
//        try {
//            Database db = Database.getInstance();
//            Statement stt = db.getStatement();
//            String sql = "select * from sinhvien";
//            ResultSet rs = stt.executeQuery(sql);
//            while (rs.next()){
//                Integer id = rs.getInt("id");
//                String name = rs.getString("name");
//                String email = rs.getString("email");
//                Date birthday = rs.getDate("birthday");
//                String gender = rs.getString("gender");
//                Integer classId = rs.getInt("class_id");
//                Student s = new Student(id,name,email,birthday,gender,classId);
//                list.add(s);
//            }
//        } catch (Exception e) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setHeaderText(e.getMessage());
//            alert.show();
//        }
//        return list;
//    }
//
//    public boolean create(Student student) {
//        try {
//            Database db = Database.getInstance();
//            Statement stt = db.getStatement();
//            String sql = "insert into sinhvien(name,email,birthday,gender,class_id) values('" + student.getName() + "','" +student.getEmail()+ "','"+student.getBirthday()+"','"+student.getGender()+"','"+student.getClass_id()+"')";
//            if (stt.executeUpdate(sql) > 0) {
//                return true;
//            }
//        } catch (Exception e) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setHeaderText(e.getMessage());
//            alert.show();
//        }
//        return false;
//    }
//
//    public boolean update(Student student) {
//        try {
//            Database db = Database.getInstance();
//            Statement stt = db.getStatement();
//            String sql = "update sinhvien set name='" + student.getName() + "', email='" + student.getEmail() + "', birthday='"+student.getBirthday()+"', gender='"+student.getGender()+"', class_id='"+student.getClass_id()+"' where id = " + student.getId();
//            if (stt.executeUpdate(sql) > 0) {
//                return true;
//            }
//        } catch (Exception e) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setHeaderText(e.getMessage());
//            alert.show();
//        }
//        return false;
//    }
//
//    public boolean delete(Student student) {
//        try {
//            Database db = Database.getInstance();
//            Statement stt = db.getStatement();
//            String sql = "delete from sinhvien where id = " + student.getId();
//            if (stt.executeUpdate(sql) > 0) {
//                return true;
//            }
//        } catch (Exception e) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setHeaderText(e.getMessage());
//            alert.show();
//        }
//        return false;
//    }
//    public Student find(Integer id){
//        try {
//            Database db = Database.getInstance();
//            Statement stt = db.getStatement();
//            String sql = "select * from sinhvien where id="+id;
//            ResultSet rs = stt.executeQuery(sql);
//            while (rs.next()) {
//                String name = rs.getString("name");
//                String email = rs.getString("email");
//                Date birthday = rs.getDate("birthday");
//                String gender = rs.getString("gender");
//                Integer classId = rs.getInt("class_id");
//                Student s = new Student(id,name,email,birthday,gender,classId);
//                return s;
//            }
//        } catch (Exception e) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setHeaderText(e.getMessage());
//            alert.show();
//        }
//        return null;
//    }
}
