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
@Table(name = "business")
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer businessId;
    @Column
    private String businessName;
    @Column
    private String businessAddress;
    @Column
    private String businessExplain;
    @Column
    private String businessImg;
    @Column
    private Integer orderTypeId;
    @Column
    private Double starPrice;
    @Column
    private Double deliveryPrice;
    @Column
    private String remarks;
}
