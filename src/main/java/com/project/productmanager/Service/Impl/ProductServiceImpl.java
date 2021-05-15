package com.project.productmanager.Service.Impl;

import com.project.productmanager.Entity.Customer;
import com.project.productmanager.Entity.Product;
import com.project.productmanager.Repository.ProductRepository;
import com.project.productmanager.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public void save(Product product) {
        if (product != null) {
            productRepository.save(product);
        }
    }

    @Override
    public void update(Product product) {
        Optional<Product> optionalProduct = productRepository.findById(product.getProductId());
        if (!optionalProduct.isPresent()) {
            productRepository.save(product);
        } else {
            optionalProduct.get().setProductName(product.getProductName());
            optionalProduct.get().setDescription(product.getDescription());
            productRepository.save(optionalProduct.get());
        }
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Product findById(int id) {
        return null;
    }
}
