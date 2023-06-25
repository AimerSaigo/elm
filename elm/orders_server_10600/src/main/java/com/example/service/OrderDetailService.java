package com.example.service;

import com.example.dao.OrderDetailDao;
import com.example.po.CommonResult;
import com.example.po.OrderDetail;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {
    @Resource
    OrderDetailDao orderDetailDao;

    public CommonResult<List<OrderDetail>> getOrderDetail(int oid) {
        List<OrderDetail> orderDetailList = orderDetailDao.getOrderDetailByOrderId(oid);
        if (orderDetailList == null) {
            return new CommonResult<>(500, "请求失败", null);
        }
        return new CommonResult<>(200,"请求成功",orderDetailList);
    }
}
