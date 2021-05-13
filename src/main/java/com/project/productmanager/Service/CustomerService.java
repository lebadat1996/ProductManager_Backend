package com.project.productmanager.Service;

import com.project.productmanager.Entity.Customer;

public interface CustomerService {
    void save(Customer customer);

    void update(Customer customer);

    void delete(int id);

    Customer findById(int id);
}
