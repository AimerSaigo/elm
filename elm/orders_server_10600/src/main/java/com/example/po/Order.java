package com.example.po;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer orderId;
    @Column
    private Integer userId;
    @Column
    private Integer businessId;
    @Column
    private String orderDate;
    @Column
    private Double orderTotal;
    @Column
    private Integer daId;
    @Column
    private Integer orderState;
}
