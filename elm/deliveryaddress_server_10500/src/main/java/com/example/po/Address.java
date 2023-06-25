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
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer daId;
    @Column
    private String contactName;
    @Column
    private Integer contactSex;
    @Column
    private Integer contactTel;
    @Column
    private String dAddress;
    @Column
    private Integer userId;
}
