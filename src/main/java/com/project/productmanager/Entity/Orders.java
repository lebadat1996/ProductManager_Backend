package com.project.productmanager.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private String customerId;
    private Date saleDate;
    private String bossName;
    private Float totalMoney;
    private String paid;

}
