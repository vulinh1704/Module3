package vulinh.codegym.service;

import vulinh.codegym.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void save(Product product);
    int findIndexByProductId(int id);
    Product findById(int id);
    List<Product> findByName(String name);
    void upDate(int id , Product product);
    void delete(int id);
}
