package com.example.controller;

import com.example.po.CommonResult;
import com.example.service.FoodService;
import jakarta.annotation.Resource;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
@RefreshScope
public class FoodController {
    @Resource
    FoodService foodService;

    @GetMapping("/getFood/{bid}")
    public CommonResult getFood(@PathVariable int bid) {
        return foodService.getFood(bid);
    }
}
