package controller;

import demo2005.Student;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2006?useSSL=false", "root", "1234");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from student ");) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int age= rs.getInt("age");
                String name = rs.getString("name");
                int id = rs.getInt("id");
                students.add(new Student(age,name,id));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
    public List<Student> findAllByOrder() {
        List<Student> students = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from student order by age asc ");) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int age= rs.getInt("age");
                String name = rs.getString("name");
                int id = rs.getInt("id");
                students.add(new Student(age,name,id));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}

