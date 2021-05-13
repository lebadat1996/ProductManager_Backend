package com.project.productmanager.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class ProductOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private String productId;
    private String description;
    private Float totalMoney;
}
