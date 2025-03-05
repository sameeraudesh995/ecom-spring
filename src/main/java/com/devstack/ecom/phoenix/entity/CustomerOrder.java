package com.devstack.ecom.phoenix.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name="customer_order")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOrder {

    @Id
    @Column(name="order_id")
    private String orderId;

    @Column(name = "date", columnDefinition = "DATETIME", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name="amount", nullable = false)
    private double amount;

    @Column(name = "status", nullable = false, columnDefinition = "TINYINT")
    private boolean status;

    @ManyToOne
    @JoinColumn(name= "user", nullable = false)
    private ApplicationUser user;
}
