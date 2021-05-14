package com.project.productmanager.Service.Impl;

import com.project.productmanager.Entity.Product;
import com.project.productmanager.Repository.ProductRepository;
import com.project.productmanager.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public void save(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Product findById(int id) {
        return null;
    }
}
