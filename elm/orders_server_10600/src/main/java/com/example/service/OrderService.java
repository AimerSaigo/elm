package com.example.service;

import com.example.dao.OrderDao;
import com.example.po.CommonResult;
import com.example.po.Order;
import jakarta.annotation.Resource;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Resource
    OrderDao orderDao;

    public CommonResult<Order> createOrder(Order order) {
        orderDao.save(order);
        return new CommonResult<>(200,"请求成功",null);
    }

    public CommonResult<List<Order>> getUserOrder(int uid) {
        List<Order> orderList = orderDao.getOrderByUserId(uid);
        if (orderList == null) {
            return new CommonResult<>(500, "请求失败", null);
        }
        return new CommonResult<>(200,"请求成功",orderList);
    }

    public CommonResult<Order> searchOrder(int daId) {
        Order order = orderDao.getOrderByOrderId(daId);
        if (order == null) {
            return new CommonResult<>(500, "请求失败", null);
        }
        return new CommonResult<>(200,"请求成功",order);
    }
}
