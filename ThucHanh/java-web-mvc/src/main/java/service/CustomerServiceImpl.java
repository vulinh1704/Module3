package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    static Map<Integer , Customer> customers;
    static {
        customers = new HashMap<>();
        customers.put(1,new Customer(1,"linh","vulinh1704@gmail.com","Hà Nội"));
        customers.put(2,new Customer(1,"Hà","ha@gmail.com","Hải Dương"));
        customers.put(3,new Customer(1,"Mạnh","manh@gmail.com","Đồng Nai"));
        customers.put(4,new Customer(1,"Thăng","thang@gmail.com","Móng Cái"));
        customers.put(5,new Customer(1,"Thắng","tnt@gmail.com","Hà Nam"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId() , customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id ,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
