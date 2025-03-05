package com.devstack.ecom.phoenix.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @Column(name = "product_id", length =80)
    private String productId;
    @Column(name = "description", length =750, nullable = false)
    private String description;
    @Column(name = "unit_price", precision = 2, nullable = false)
    private double unitPrice;
    @Column(name = "qty_on_hand", length =80)
    private int qtyOnHand;
    @Enumerated
    private FileResource fileResource;
}
