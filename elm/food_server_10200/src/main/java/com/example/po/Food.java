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
@Table(name = "food")
public class Food {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "foodId")
    @Id
    private Integer foodId;
    @Column(name = "foodName")
    private String foodName;
    @Column(name = "foodExplain")
    private String foodExplain;
    @Column(name = "foodImg")
    private String foodImg;
    @Column(name = "foodPrice")
    private Double foodPrice;
    @Column(name = "businessId")
    private Integer businessId;
    @Column(name = "remarks")
    private String remarks;
}
