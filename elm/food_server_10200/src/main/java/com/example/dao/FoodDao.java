package com.example.dao;

import com.example.po.CommonResult;
import com.example.po.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodDao extends JpaRepository<Food, String> {
    public List<Food> listFoodByBusinessId(int businessId);
}
