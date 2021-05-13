package com.project.productmanager.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "CUSTOMER_ID")
    private Integer customerID;
    @Column(columnDefinition = "FULL_NAME")
    private String fullName;
    @Column(columnDefinition = "PHONE")
    private String phone;
    @Column(columnDefinition = "ADDRESS")
    private String address;
}
