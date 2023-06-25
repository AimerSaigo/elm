package com.example.controller;

import com.example.dao.OrderDao;
import com.example.po.CommonResult;
import com.example.po.Order;
import com.example.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@RefreshScope
public class OrderController {
    @Resource
    OrderService orderService;

    @PostMapping("/createOrder")
    public CommonResult<Order> createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @GetMapping("/getOrder/{uid}")
    public CommonResult<List<Order>> getOrder(@PathVariable int uid) {
        return orderService.getUserOrder(uid);
    }

    @GetMapping("/searchOrder/{oId}")
    public CommonResult<Order> searchOrder(@PathVariable int daId) {
        return orderService.searchOrder(daId);
    }
}
