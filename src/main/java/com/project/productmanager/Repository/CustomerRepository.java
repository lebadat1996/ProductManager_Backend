package com.project.productmanager.Repository;

import com.project.productmanager.Entity.Customer;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
