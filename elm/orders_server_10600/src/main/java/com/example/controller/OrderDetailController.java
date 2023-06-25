package com.example.controller;

import com.example.po.CommonResult;
import com.example.po.OrderDetail;
import com.example.service.OrderDetailService;
import jakarta.annotation.Resource;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderDetail")
@RefreshScope
public class OrderDetailController {
    @Resource
    OrderDetailService orderDetailService;

    @GetMapping("/getOrderDetail/{oid}")
    public CommonResult<List<OrderDetail>> getOrderDetail(@PathVariable int oid) {
        return orderDetailService.getOrderDetail(oid);
    }
}
