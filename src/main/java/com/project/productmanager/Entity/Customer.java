package com.project.productmanager.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    private String fullName;
    private String phone;
    private String address;
}
