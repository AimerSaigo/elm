package com.example.service;

import com.example.dao.FoodDao;
import com.example.po.CommonResult;
import com.example.po.Food;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    @Resource
    FoodDao foodDao;

    public CommonResult<List<Food>> getFood(int businessId) {
        List<Food> foods = foodDao.listFoodByBusinessId(businessId);
        if (foods == null) {
            return new CommonResult<List<Food>>(500, "未找到商品", null);
        }
        return new CommonResult<List<Food>>(200, "请求成功", foods);
    }
}
