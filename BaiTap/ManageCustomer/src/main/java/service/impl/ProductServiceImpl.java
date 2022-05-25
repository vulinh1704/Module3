package service;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductSerViceImpl implements ProductService {

    @Override
    public void add(Product product) throws SQLException {
        
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Product product) throws SQLException {
        return false;
    }
}
