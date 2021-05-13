package com.project.productmanager.Service;

import com.project.productmanager.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductService extends JpaRepository<Product, Integer> {
}
