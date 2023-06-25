package com.example.controller;

import com.example.FoodClient;
import com.example.po.Business;
import com.example.po.CommonResult;
import com.example.service.BusinessService;
import jakarta.annotation.Resource;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/business")
@RefreshScope
public class BusinessController {
    @Resource
    BusinessService businessService;
    @Resource
    FoodClient foodClient;

    @GetMapping("/{bid}/getBusinessInfo")
    public CommonResult<Business> getBusinessInfo(int bid) {
        return businessService.getBusinessById(bid);
    }

    @GetMapping("/getBusinessList")
    public CommonResult<List<Business>> getBusinessList() {
        return businessService.getBusinessList();
    }

    @GetMapping("/{bid}/getFood")
    public CommonResult getFood(@PathVariable("bid") int bid) {
        CommonResult res = foodClient.getFood(bid);
        if (res.getCode() == 200) {
            return res;
        }
        return new CommonResult(500, "请求失败", null);
    }
}
