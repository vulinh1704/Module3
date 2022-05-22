package dao;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO <T>{
    void insertUser (T t) throws SQLException;
    User selectUser (int id);
    List<T> selectAllUsers();
    boolean deleteUser(int id) throws SQLException;
    boolean updateUser(T t) throws SQLException;
}
