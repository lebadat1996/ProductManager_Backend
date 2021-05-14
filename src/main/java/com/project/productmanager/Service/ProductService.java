package com.project.productmanager.Service;


import com.project.productmanager.Entity.Product;

public interface ProductService {
    void save(Product product);

    void update(Product product);

    void delete(int id);

    Product findById(int id);
}
