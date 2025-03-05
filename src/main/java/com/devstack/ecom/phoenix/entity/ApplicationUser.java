package com.devstack.ecom.phoenix.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.HashSet;
import java.util.Set;

@Entity(name="application_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationUser {
    @Id
    @Column(name = "user_id", length = 80)
    private String userId;
    @Column(name="username", length = 100, nullable = false)
    private String username;
    @Column(name="password", length = 750, nullable = false )
    private String password;
    @Column(name = "address", length = 750, nullable = false)
    private String address;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private Set<CustomerOrder> customerOrders = new HashSet<>();

}
