package service;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
    void add(Customer customer) throws SQLException;

    Customer findById(int id);

    List<Customer> findAll();

    boolean delete(int id) throws SQLException;

    boolean update(Customer customer , int id) throws SQLException;
    int findIndexById(int id);
}
