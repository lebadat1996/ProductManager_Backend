package com.project.productmanager.Service.Impl;

import com.project.productmanager.Entity.Customer;
import com.project.productmanager.Repository.CustomerRepository;
import com.project.productmanager.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void save(Customer customer) {
        if (customer != null) {
            customerRepository.save(customer);
        }
    }

    @Override
    public void update(Customer customer) {

        Optional<Customer> cus = customerRepository.findById(customer.getCustomerId());
        if (!cus.isPresent()) {
            customerRepository.save(customer);
        } else {
            cus.get().setAddress(customer.getAddress());
            cus.get().setFullName(customer.getFullName());
            cus.get().setPhone(customer.getPhone());
            customerRepository.save(cus.get());
        }
    }

    @Override
    public void delete(int id) {
        try {
            Optional<Customer> customer = customerRepository.findById(id);
            if (customer.isPresent()) {
                customerRepository.delete(customer.get());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Customer findById(int id) {
        try {
            Optional<Customer> customer = customerRepository.findById(id);
            if (customer.isPresent()) {
                return customer.get();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
